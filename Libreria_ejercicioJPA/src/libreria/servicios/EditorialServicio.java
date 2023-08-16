package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 * EditorialServicio Esta clase tiene la responsabilidad de llevar adelante las
 * funcionalidades necesarias para administrar editoriales (consulta, creación,
 * modificación y eliminación)
 *
 * @author Mariano Benegas
 */
public class EditorialServicio {
    private final EditorialDAO dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EditorialServicio() {
        this.dao = new EditorialDAO();
    }
        

    public void consultaTablaEditorial() throws Exception {
        try {
            List<Editorial> editoriales = dao.consultarTablaEditorial();
            for (Editorial aux : editoriales) {
                System.out.println(aux);
            }
        } catch (Exception e) {
            System.out.println("Error en consulta tabla Editorial");
        }
    }
    
    public void crearEditorial() throws Exception {
        System.out.println("A continuacion crearemos una EDITORIAL");
        System.out.println("Ingrese el nombre completo");
        String nombre = leer.next();
       
        try {
            if (nombre == null || nombre == "") {
                throw new Exception("Debe Ingresar un nombre");
            }
            Editorial editorial = new Editorial();
            editorial.setNombre(nombre);
            editorial.setAlta(Boolean.TRUE);
            dao.guardarEditorial(editorial);
            System.out.println("Se creo una nueva Editorial");
        } catch (Exception e) {
            System.out.println("Error al crear nueva Editorial");
        }
    }

    public void modificarEditorial() throws Exception {
        System.out.println("A continuacion podra modificar una EDITORIAL");
        System.out.println("Ingrese Nombre de la Editorial a buscar");
        String nombreE = leer.next();
        try {
            if (nombreE == null || nombreE == "") {
                throw new Exception("Debe Ingresar un nombre de Editorial");
            }
            if (dao.buscarEditorialPorNombre(nombreE) == null) {
                System.out.println("No existe la editorial");
            } else {
                Editorial editorial = (Editorial) dao.buscarEditorialPorNombre(nombreE);
                System.out.println("Ingrese el nuevo nombre de Editorial");
                editorial.setNombre(nombreE);
                dao.modificarEditorial(editorial);
                System.out.println("Se modifico correctamente");
            }
        } catch (Exception e) {
            System.out.println("Error al modificar Editorial");
        }
    }

    public void eliminarEditorial() throws Exception {
       System.out.println("PRECAUCION eliminara una EDITORIAL");
        System.out.println("Ingrese Nombre de la Editorial a buscar");
        String nombreE = leer.next();
        try {
            if (nombreE == null || nombreE == "") {
                throw new Exception("Debe Ingresar un nombre de Editorial");
            }
            if (dao.buscarEditorialPorNombre(nombreE) == null) {
                System.out.println("No existe la Editorial");
            } else {
                Editorial editorial = (Editorial) dao.buscarEditorialPorNombre(nombreE);
                dao.eliminarEditorial(editorial);
                System.out.println("Se elimino la Editorial");
            }
        } catch (Exception e) {
            System.out.println("Error al Eliminar Editorial");
        }
    }
    
     public Editorial consultaEditorialPorNombre(String nombreE) throws Exception {
        Editorial editorial = null;
        try {
            if (nombreE == null || nombreE == "") {
                throw new Exception("Debe Ingresar un nombre de Editorial");
            }            
            editorial = dao.buscarEditorialPorNombre(nombreE);
            
        } catch (Exception e) {
            System.out.println("Error al consultar Editorial");
        }
        return editorial;
    }


}
