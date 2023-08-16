package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Libro;

/**
 *
 * @author Mariano Benegas
 */
public final class LibroDAO extends DAO<Libro> {

    public void guardarLibro(Libro libro) {
        super.guardar(libro);
    }

    public void modificarLibro(Libro libro) {
        super.actualizar(libro);
    }

    public void eliminarLibro(Libro libro) {
        super.eliminar(libro);
    }

    public List consultarTablaLibro() {
        super.conectar();
        List<Libro> libros = em.createQuery(" SELECT l FROM Libro l ")
                .getResultList();
        super.desconectar();
        return libros;
    }

    public Libro buscarLibroPorIcbn(Long icbn) {
        super.conectar();
        Libro libro = em.find(Libro.class, icbn);
        super.desconectar();
        return libro;

    }

    public Libro buscarLibroporTitulo(String tituloL) {
        super.conectar();
        Libro libro = (Libro) em.createQuery(" SELECT l FROM Libro l "
                + " WHERE l.titulo LIKE :tituloL ")
                .setParameter("tituloL", tituloL).getSingleResult();
        super.desconectar();
        return libro;

    }

    public List buscarLibroPorAutor(String nombreA) {
        super.conectar();
        List<Libro> libros = em.createQuery(" SELECT l FROM Libro l JOIN l.autor a "
                + " WHERE a.nombre LIKE :nombreA ")
                .setParameter("nombreA", nombreA).getResultList();
        super.desconectar();
        return libros;
    }

    public List buscarLibroPorEditorial(String nombreE) {
        super.conectar();
        List<Libro> libros = em.createQuery(" SELECT l FROM Libro l JOIN l.editorial e "
                + " WHERE e.nombre LIKE :nombreE ")
                .setParameter("nombreE", nombreE).getResultList();
        super.desconectar();
        return libros;
    }
}
