package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author Mariano Benegas
 */
public final class AutorDAO extends DAO<Autor> {

    public void guardarAutor(Autor autor) {
        super.guardar(autor);
    }

    public void modificarAutor(Autor autor) {
        super.actualizar(autor);
    }

    public void eliminarAutor(Autor autor) {
        super.eliminar(autor);
    }

    public List consultarTablaAutor() {
        super.conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a")
                .getResultList();
        super.desconectar();
        return autores;
    }

    public Autor buscarAutorPorNombre(String nombreA) {
        super.conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a"
                + " WHERE a.nombre LIKE :nombre", Autor.class)
                .setParameter("nombre", nombreA).getSingleResult();
        super.desconectar();
        return autor;
    }
    
    public Autor buscarAutorPorId(Integer idA) {
        super.conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a"
                + " WHERE a.id LIKE :id", Autor.class)
                .setParameter("id", idA).getSingleResult();
        super.desconectar();
        return autor;
    }
  
}
