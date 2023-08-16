package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.LibroDAO;

/**
 * LibroServicio Esta clase tiene la responsabilidad de llevar adelante las
 * funcionalidades necesarias para administrar libros (consulta, creación,
 * modificación y eliminación).
 *
 * @author Mariano Benegas
 */
public class LibroServicio {

    private final LibroDAO dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public LibroServicio() {
        this.dao = new LibroDAO();
    }

    public List consultaTablaLibro() throws Exception {
        List<Libro> libros = null;
        try {
            libros =  dao.consultarTablaLibro();
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        } catch (Exception e) {
            System.out.println("Error en consulta tabla Libro");
        }
        return libros;
    }

    public void crearLibro() throws Exception {
        System.out.println("A continuacion crearemos un LIBRO en base de datos");
        System.out.println("Ingrese el numero de ISBN");
        Long isbn = leer.nextLong();
        System.out.println("Ingrese el titulo del libro completo");
        String titulo = leer.next();
        System.out.println("Ingrese el año de Edicion");
        Integer anio = leer.nextInt();
        System.out.println("Ingrese cantidad de ejemplares a cargar");
        Integer ejemplares = leer.nextInt();
        System.out.println("Indique nombre de Autor");
        String nombreA = leer.next();
        System.out.println("Ingrese Editorial");
        String nombreE = leer.next();
        Autor aux = new Autor();
        AutorServicio autorSer = new AutorServicio();
        Editorial auxE = new Editorial();
        EditorialServicio editorialSer = new EditorialServicio();

        try {

            if (isbn == null) {
                throw new Exception("Debe ingresar un numero Isbn");
            }
            if (titulo == null || titulo == "") {
                throw new Exception("Debe ingresar un titulo");
            }
            if (anio == null) {
                throw new Exception("Debe indicar año del libro");
            }
            if (ejemplares == null) {
                throw new Exception("Debe indicar cantidad de libros");
            }
            if (nombreA == null || nombreA == "") {
                throw new Exception("Debe indicar nombre de Autor");
            }
            if (nombreA.equalsIgnoreCase(autorSer.consultaAutorPorNombre(nombreA).getNombre())) {
                aux = autorSer.consultaAutorPorNombre(nombreA);
      
            }else{
                System.out.println("El autor no se encontro debe cargarlo");
                autorSer.crearAutor();
                aux = autorSer.consultaAutorPorNombre(nombreA);
            }
            if (nombreE == null || nombreE == "") {
                throw new Exception("Debe indicar Editorial");
            }
            if (editorialSer.consultaEditorialPorNombre(nombreE) == null) {
                System.out.println("La Editorial no se encontro debe cargarla");
                editorialSer.crearEditorial();
                auxE = editorialSer.consultaEditorialPorNombre(nombreE);
            } else {
                auxE = editorialSer.consultaEditorialPorNombre(nombreE);
            }
            Libro libro = new Libro();
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(0);
            libro.setEjemplaresRestantes(ejemplares);
            libro.setAutor(aux);
            libro.setEditorial(auxE);
            libro.setAlta(Boolean.TRUE);
            dao.guardarLibro(libro);
            System.out.println("Se creo un nuevo Libro");

        } catch (Exception e) {
            System.out.println("Error al crear nuevo Libro");
        }

    }

    public void modificarLibro() throws Exception {
        System.out.println("A continuacion podra modificar un Libro");
        System.out.println("Ingrese TITULO del Libro a buscar");
        String busca = leer.next(); 
        AutorServicio autorSer = new AutorServicio();
        try {
            if (busca == null || busca == "") {
                System.out.println("Debe ingresar un nombre valido");
            }
            Libro auxL = dao.buscarLibroporTitulo(busca);
            System.out.println("Modificacion: nuevo numero ISBN");
            Long isbn = leer.nextLong();
            System.out.println("Modificacion: nuevo titulo de libro completo");
            String titulo = leer.next();
            System.out.println("Modificacion: año de Edicion");
            Integer anio = leer.nextInt();
            System.out.println("Modificacion: cantidad total ejemplares");
            Integer ejemplares = leer.nextInt();
            System.out.println("Modificacion: Autor");
            String nombreA = leer.next();
            System.out.println("Modificacion: Editorial");
            String nombreE = leer.next();
            Autor aux = null;
            EditorialServicio editorialSer = new EditorialServicio();
            Editorial auxE = null;
            try {

                if (isbn == null) {
                    throw new Exception("Debe ingresar un numero Isbn");
                }
                if (titulo == null || titulo == "") {
                    throw new Exception("Debe ingresar un titulo");
                }
                if (anio == null) {
                    throw new Exception("Debe indicar año del libro");
                }
                if (ejemplares == null) {
                    throw new Exception("Debe indicar cantidad de libros");
                }
                if (nombreA == null || nombreA == "") {
                    throw new Exception("Debe indicar nombre de Autor");
                }
                if (autorSer.consultaAutorPorNombre(nombreA) == null) {
                    System.out.println("El autor no se encontro debe cargarlo");
                    autorSer.crearAutor();
                    aux = autorSer.consultaAutorPorNombre(nombreA);
                } else {
                    aux = autorSer.consultaAutorPorNombre(nombreA);
                }
                if (nombreE == null || nombreE == "") {
                    throw new Exception("Debe indicar Editorial");
                }
                if (editorialSer.consultaEditorialPorNombre(nombreE) == null) {
                    System.out.println("La Editorial no se encontro debe cargarla");
                    editorialSer.crearEditorial();
                    auxE = editorialSer.consultaEditorialPorNombre(nombreE);
                } else {
                    auxE = editorialSer.consultaEditorialPorNombre(nombreE);
                }
                Libro libro = new Libro();
                libro.setIsbn(isbn);
                libro.setTitulo(titulo);
                libro.setAnio(anio);
                libro.setEjemplares(ejemplares);
                libro.setAutor(aux);
                libro.setEditorial(auxE);
                dao.modificarLibro(libro);

            } catch (Exception e) {
                System.out.println("Error al modificar Libro");
            }

        } catch (Exception e) {
            System.out.println("Error al modificar Libro");
        }
    }

    public void eliminarLibro() throws Exception {
        System.out.println("PRECAUCION eliminara un LIBRO");
        System.out.println("Ingrese Titulo del Libro a buscar");
        String titulo = leer.next();
        try {
            if (titulo == null || titulo == "") {
                throw new Exception("Debe Ingresar un titulo valido");
            }
            if (dao.buscarLibroporTitulo(titulo) == null) {
                System.out.println("No existe el libro");
            } else {
                Libro libro = (Libro) dao.buscarLibroporTitulo(titulo);
                dao.eliminarLibro(libro);
                System.out.println("Se elimino el Libro");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar Libro");
        }

    }

    public Libro buscarLibroPorTitulo(String titulo) throws Exception {
        Libro libro = new Libro();
        try {
            if (titulo == null || titulo == "") {
                System.out.println("Debe ingresar un titulo");
            }
            libro = dao.buscarLibroporTitulo(titulo);        
            //System.out.println(libro.toString());
        } catch (Exception e) {
            System.out.println("Error en consulta tabla");
        }
        return libro;       
    }

    public void buscarLibroPorIsbn(Long isbn) throws Exception {
         try {
           if (isbn == null) {
                System.out.println("Debe ingresar un numero isbn valido");
            }
            Libro libro = dao.buscarLibroPorIcbn(isbn);        
             System.out.println(libro.toString());
        } catch (Exception e) {
            System.out.println("Error en consulta tabla");
        }
       
    }

    public List buscarLibroPorAutor(String nombreA) throws Exception {
        List<Libro> libros = null;
        try {
            if (nombreA == null || nombreA == "") {
                System.out.println("Debe ingresar un nombre valido de autor");
            }
            libros = dao.buscarLibroPorAutor(nombreA);
        } catch (Exception e) {
            System.out.println("Error en consulta tabla");
        }
       return libros;
    }
    
    public List buscarLibroPorEditorial(String nombreE) throws Exception {
        List<Libro> libros = null;
        try {
            if (nombreE == null) {
                System.out.println("Debe ingresar un nombre valido de editorial");
            }
            libros = dao.buscarLibroPorEditorial(nombreE);
        } catch (Exception e) {
            System.out.println("Error en consulta tabla");
        }
       return libros;
    }

}
