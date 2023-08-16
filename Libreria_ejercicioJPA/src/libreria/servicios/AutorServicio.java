package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 * AutorServicio Esta clase tiene la responsabilidad de llevar adelante las
 * funcionalidades necesarias para administrar autores (consulta, creación,
 * modificación y eliminación).
 *
 * @author Mariano Benegas
 */
public class AutorServicio {

    private final AutorDAO dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public AutorServicio() {
        this.dao = new AutorDAO();
    }
    
    public void consultaTablaAutor() throws Exception {
        try {
            List<Autor> autores = dao.consultarTablaAutor();
            for (Autor aux : autores) {
                System.out.println(aux);
            }
        } catch (Exception e) {
            System.out.println("Error en consulta tabla Autor");
        }
    }

    public void crearAutor() throws Exception {
        System.out.println("A continuacion crearemos un AUTOR");
        System.out.println("Ingrese el nombre completo");
        String nombre = leer.next();
        try {
            if (nombre == null || nombre == "") {
                throw new Exception("Debe Ingresar un nombre");
            }
            if (nombre.equalsIgnoreCase(consultaAutorPorNombre(nombre).getNombre())) {
                throw new Exception("NOMBRE YA EXISTENTE");
            }
            Autor autor = new Autor();
            autor.setNombre(nombre);
            autor.setAlta(Boolean.TRUE);
            dao.guardarAutor(autor);
            System.out.println("Se creo un nuevo Autor");
        } catch (Exception e) {
            System.out.println("Error al crear nuevo Autor");
        }
    }

    public void modificarAutor() throws Exception {
        System.out.println("A continuacion podra modificar un AUTOR");
        System.out.println("Ingrese Nombre del Autor a buscar");
        String nombreA = leer.next();
        try {
            if (nombreA == null || nombreA == "") {
                throw new Exception("Debe Ingresar un nombre de Autor");
            }
            if (dao.buscarAutorPorNombre(nombreA) == null) {
                System.out.println("No existe el autor");
            } else {
                Autor autor = (Autor) dao.buscarAutorPorNombre(nombreA);
                System.out.println("Ingrese el nuevo nombre de AUTOR");
                autor.setNombre(nombreA);
                dao.modificarAutor(autor);
                System.out.println("Se modifico correctamente");
            }
        } catch (Exception e) {
            System.out.println("Error al modificar Autor");
        }
    }

    public void eliminarAutor() throws Exception {
        System.out.println("PRECAUCION eliminara un AUTOR");
        System.out.println("Ingrese Nombre del Autor a buscar");
        String nombreA = leer.next();
        try {
            if (nombreA == null || nombreA == "") {
                throw new Exception("Debe Ingresar un nombre de Autor");
            }
            if (dao.buscarAutorPorNombre(nombreA) == null) {
                System.out.println("No existe el autor");
            } else {
                Autor autor = (Autor) dao.buscarAutorPorNombre(nombreA);
                dao.eliminarAutor(autor);
                System.out.println("Se elimino el Autor");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar Autor");
        }
    }

    public Autor consultaAutorPorNombre(String nombreA) throws Exception {
        Autor autor = new Autor();
        try {

            if (nombreA == null) {
                throw new Exception("Debe Ingresar un nombre de Autor");
            }

            autor = dao.buscarAutorPorNombre(nombreA);
        } catch (Exception e) {
            System.out.println("no se encontro un autor");
        }

        return autor;
    }

}
