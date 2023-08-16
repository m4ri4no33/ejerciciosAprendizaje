package libreria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.ClienteServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;

/**
 *
 * @author Mariano Benegas
 */
public class Libreria_ejercicioJPA {

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PrestamoServicio prestamoS = new PrestamoServicio();
        ClienteServicio clienteS = new ClienteServicio();
        LibroServicio libroS = new LibroServicio();
        AutorServicio autorS = new AutorServicio();
        EditorialServicio editorialS = new EditorialServicio();

        List<Libro> auxList = new ArrayList<>();
        Autor imprimeA = new Autor();

        int op, opA, opB, opC, opD, opE, opP, opBusca, opBuscaCliente;

        do {

            System.out.println("--------------MENU BIBLIOTECA-------------"
                    + "\n----------Opciones disponibles----------"
                    + "\n 1 - Menu prestamo"
                    + "\n 2 - Consultar Tabla"
                    + "\n 3 - Cargar nuevo"
                    + "\n 4 - Modificar"
                    + "\n 5 - Eliminar"
                    + "\n 6 - Busqueda"
                    + "\n 7 - Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    do {
                        System.out.println("MENU PRESTAMO: "
                                + "\n 1-Nuevo Prestamo"
                                + "\n 2-Buscar Prestamo por Libro"
                                + "\n 3-Buscar Prestamo por Cliente"
                                + "\n 4-Devoluciones"
                                + "\n 5-Regresar");
                        opP = leer.nextInt();
                        switch (opP) {
                            case 1:
                                prestamoS.crearPrestamo();
                                break;
                            case 2:
                                System.out.println("Ingrese un titulo de libro");
                                prestamoS.buscarPrestamoPorLibro(leer.next());
                                break;
                            case 3:
                                System.out.println("Ingrese documento cliente");
                                prestamoS.buscarPrestamoPorCliente(leer.nextLong());
                                break;
                            case 4:
                                System.out.println("Ingrese DNI cliente para devolucion");
                                prestamoS.devolucion(leer.nextLong());
                                break;
                        }
                    } while (opP != 5);
                    break;
                case 2:
                    do {
                        System.out.println("MENU CONSULTA: "
                                + "\n 1-Autor"
                                + "\n 2-Editorial"
                                + "\n 3-Libro"
                                + "\n 4-Cliente"
                                + "\n 5-Prestamo"
                                + "\n 6-Todas"
                                + "\n 7-Regresar");
                        opA = leer.nextInt();
                        switch (opA) {
                            case 1:
                                autorS.consultaTablaAutor();
                                break;
                            case 2:
                                editorialS.consultaTablaEditorial();
                                break;
                            case 3:
                                libroS.consultaTablaLibro();
                                break;
                            case 4:
                                clienteS.consultarTablaCliente();
                                break;
                            case 5:
                                prestamoS.consultaTablaPrestamo();
                            case 6:
                                System.out.println("-----AUTORES-----");
                                autorS.consultaTablaAutor();
                                System.out.println("-----EDITORIALES-----");
                                editorialS.consultaTablaEditorial();
                                System.out.println("-----LIBROS-----");
                                libroS.consultaTablaLibro();
                                System.out.println("-----CLIENTES-----");
                                clienteS.consultarTablaCliente();
                                System.out.println("-----PRESTAMOS-----");
                                prestamoS.consultaTablaPrestamo();
                                break;
                        }
                    } while (opA != 7);
                    break;

                case 3:
                    do {
                        System.out.println("MENU CARGAR NUEVO:"
                                + "\n 1-Autor"
                                + "\n 2-Editorial"
                                + "\n 3-Libro"
                                + "\n 4-Cliente"
                                + "\n 5-Regresar");
                        opB = leer.nextInt();
                        switch (opB) {
                            case 1:
                                autorS.crearAutor();
                                break;
                            case 2:
                                editorialS.crearEditorial();
                                break;
                            case 3:
                                libroS.crearLibro();
                                break;
                            case 4:
                                clienteS.crearCliente();
                        }
                    } while (opB != 5);
                    break;

                case 4:
                    do {
                        System.out.println("MENU MODIFICAR:"
                                + "\n 1-Autor"
                                + "\n 2-Editorial"
                                + "\n 3-Libro"
                                + "\n 4-Cliente"
                                + "\n 5-Regresar");
                        opC = leer.nextInt();
                        switch (opC) {
                            case 1:
                                autorS.modificarAutor();
                                break;
                            case 2:
                                editorialS.modificarEditorial();
                                break;
                            case 3:
                                libroS.modificarLibro();
                                break;
                            case 4:
                                clienteS.modificarCliente();
                                break;
                        }
                    } while (opC != 5);
                    break;

                case 5:
                    do {
                        System.out.println("MENU ELIMINAR:"
                                + "\n 1-Autor"
                                + "\n 2-Editorial"
                                + "\n 3-Libro"
                                + "\n 4-Cliente"
                                + "\n 5-Regresar");
                        opD = leer.nextInt();
                        switch (opD) {
                            case 1:
                                autorS.eliminarAutor();
                                break;
                            case 2:
                                editorialS.eliminarEditorial();
                                break;
                            case 3:
                                libroS.eliminarLibro();
                                break;
                            case 4:
                                clienteS.eliminarCliente();
                        }
                    } while (opD != 5);
                    break;

                case 6:
                    do {
                        System.out.println("MENU BUSQUEDA:"
                                + "\n 1-Autor"
                                + "\n 2-Editorial"
                                + "\n 3-Libro"
                                + "\n 4-Cliente"
                                + "\n 5-Regresar");
                        opE = leer.nextInt();
                        switch (opE) {
                            case 1:
                                System.out.println("Ingrese un el nombre de Autor a buscar");
                                System.out.println(autorS.consultaAutorPorNombre(leer.next()));
                                break;
                            case 2:
                                System.out.println("Ingrese un nombre de Editorial a buscar");
                                System.out.println(editorialS.consultaEditorialPorNombre(leer.next()));
                                break;
                            case 3:
                                do {
                                    System.out.println("MENU BUSQUEDA LIBRO"
                                            + "\n 1-Titulo"
                                            + "\n 2-Autor"
                                            + "\n 3-Editorial"
                                            + "\n 4-Isbn"
                                            + "\n 5-Regresar");
                                    opBusca = leer.nextInt();
                                    switch (opBusca) {
                                        case 1:
                                            System.out.println("Ingrese titulo a buscar");
                                            System.out.println(libroS.buscarLibroPorTitulo(leer.next()));
                                            break;
                                        case 2:
                                            System.out.println("Ingrese Autor del/los Libros");
                                            auxList = libroS.buscarLibroPorAutor(leer.next());
                                            for (Libro libro : auxList) {
                                                System.out.println(libro);
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Ingrese Editorial del/los Libros");
                                            auxList = libroS.buscarLibroPorEditorial(leer.next());
                                            for (Libro libro : auxList) {
                                                System.out.println(libro);
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Ingrese Numero ISBN");
                                            libroS.buscarLibroPorIsbn(leer.nextLong());
                                            break;
                                    }
                                } while (opBusca != 5);
                                break;
                            case 4:
                                do {
                                    System.out.println("MENU BUSQUEDA CLIENTE:"
                                            + "\n 1-Apellido"
                                            + "\n 2-Documento"
                                            + "\n 3-Id"
                                            + "\n 4-Regresar");
                                    opBuscaCliente = leer.nextInt();
                                    switch (opBuscaCliente) {
                                        case 1:
                                            System.out.println("Ingrese apellido del cliente");
                                            clienteS.buscarClientePorApellido(leer.next());
                                            break;
                                        case 2:
                                            System.out.println("Ingrese numero de documento");
                                            clienteS.buscarClientePorDni(leer.nextLong()).toString();
                                            break;
                                        case 3:
                                            System.out.println("Ingrese el ID del cliente");
                                            clienteS.buscarClientePorId(leer.nextInt()).toString();
                                            break;
                                    }
                                } while (opBuscaCliente != 4);

                        }
                    } while (opE != 5);
                /* Búsqueda de un Autor por nombre.
9) Búsqueda de un libro por ISBN.
10) Búsqueda de un libro por Título.
11) Búsqueda de un libro/s por nombre de Autor.
12) Búsqueda de un libro/s por nombre de Editorial.*/

            }

        } while (op != 7);

    }

}
