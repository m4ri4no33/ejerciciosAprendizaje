package libreria.servicios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.LibroDAO;
import libreria.persistencia.PrestamoDAO;

/**
 *
 * @author Mariano Benegas
 */
public class PrestamoServicio {

    private final PrestamoDAO dao;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //DateFormat formateaFecha = new SimpleDateFormat(toString());
    Calendar ahora = Calendar.getInstance();

    public PrestamoServicio() {
        this.dao = new PrestamoDAO();
    }

    public void consultaTablaPrestamo() throws Exception {
        try {
            List<Prestamo> prestamos = dao.consultarTablaPrestamo();
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo.toString());
            }
        } catch (Exception e) {
            System.out.println("Error en consulta tabla Libro");
        }
    }

    public void crearPrestamo() throws Exception {
        System.out.println("Continue para solicitar un Prestamo"
                + "\nIngrese numero de Documento");
        try {
            Long dni = leer.nextLong();
            ClienteServicio auxC = new ClienteServicio();
            Prestamo prestamo = new Prestamo();

            if (auxC.buscarClientePorDni(dni) == null) {
                System.out.println("El Cliente no existe debe crearlo");
            }
            auxC.crearCliente();
            if (auxC.buscarClientePorDni(dni) != null) {
                prestamo.setCliente(auxC.buscarClientePorDni(dni));
            }
            LibroServicio auxLSer = new LibroServicio();
            System.out.println("Ingrese el titulo del libro a solicitar");
            String tituloLibro = leer.next();
            if (auxLSer.buscarLibroPorTitulo(tituloLibro) == null) {
                System.out.println("Libro inexistente");
            } else {
                Libro auxL = auxLSer.buscarLibroPorTitulo(tituloLibro);
                if (auxL.getEjemplaresRestantes() <= 0) {
                    System.out.println("No quedan unidades para prestar");
                } else if (auxL.getEjemplaresRestantes() > 0) {
                    auxL.setEjemplaresPrestados(auxL.getEjemplaresPrestados() + 1);
                    auxL.setEjemplaresRestantes(auxL.getEjemplaresRestantes() - 1);
                    prestamo.setLibro(auxL);
                    LibroDAO libroDAO = new LibroDAO();
                    libroDAO.modificarLibro(auxL);
                }
            }
            prestamo.setFechaPrestamo(ahora.getTime());
            System.out.println("Fecha de prestamo por 7 dias desde ahora: "
                    + (prestamo.getFechaPrestamo()));
            ahora.add(Calendar.DATE, 7);
            prestamo.setFechaDevolucion(ahora.getTime());
            System.out.println("Feche de devolucion: " + (prestamo.getFechaDevolucion()));

            dao.guardarPrestamo(prestamo);
            System.out.println("Prestamo realizado con exito " + prestamo.toString());

        } catch (Exception e) {
            System.out.println("Error al generar prestamo");
        }
    }

    public void buscarPrestamoPorLibro(String tituloLibro) throws Exception {
        try {
            if (tituloLibro == null) {
                System.out.println("Debe ingresar un titulo de libros");
            }
            LibroServicio libroServicio = new LibroServicio();
            List<Prestamo> prestamos = new ArrayList<>();
            prestamos = dao.buscarPrestamosPorLibro(libroServicio.buscarLibroPorTitulo(tituloLibro).getIsbn());
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo.toString());
            }
        } catch (Exception e) {
            System.out.println("Error en consulta tabla");
        }
    }

    public void buscarPrestamoPorCliente(Long dni) throws Exception {
        try {
            if (dni == null || dni == 0) {
                System.out.println("Debe ingresar un documento de cliente");
            }
            ClienteServicio auxC = new ClienteServicio();
            List<Prestamo> prestamos = new ArrayList<>();
            prestamos = dao.buscarPrestamosPorCliente(auxC.buscarClientePorDni(dni).getDocumento());
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo.toString());
            }
        } catch (Exception e) {
            System.out.println("Error en consulta tabla");
        }
    }

    public void devolucion(Long dni) throws Exception {
        try {
            if (dni == null || dni == 0) {
                System.out.println("Debe ingresar un documento de cliente");
            }
            buscarPrestamoPorCliente(dni);

            LibroServicio auxLSer = new LibroServicio();
            System.out.println("Ingrese el titulo del libro a devolver");
            String tituloLibro = leer.next();
            if (auxLSer.buscarLibroPorTitulo(tituloLibro) == null) {
                System.out.println("Libro inexistente");
            }
            Libro auxL = auxLSer.buscarLibroPorTitulo(tituloLibro);
            if (auxL.getEjemplaresPrestados() > 0) {
                auxL.setEjemplaresPrestados(auxL.getEjemplaresPrestados() - 1);
                auxL.setEjemplaresRestantes(auxL.getEjemplaresRestantes() + 1);
                LibroDAO libroDAO = new LibroDAO();
                libroDAO.modificarLibro(auxL);
            }
            System.out.println("Devolucion Exitosa");

        } catch (Exception e) {
            System.out.println("Error al devolver un libro");
        }
    }

    public Prestamo buscarPrestamoPorId(Integer id) throws Exception {
        Prestamo prestamo = null;
        try {
            if (id == 0 || id == null) {
                System.out.println("Debe ingresar un ID valido");
            }
            prestamo = dao.buscarPrestamoPorId(id);
        } catch (Exception e) {
            System.out.println("Error al buscar prestamo ID");
        }
        return prestamo;
    }

}
