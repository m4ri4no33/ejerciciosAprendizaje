package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;

/**
 *
 * @author Mariano Benegas
 */
public final class EditorialDAO extends DAO<Editorial> {

    public void guardarEditorial(Editorial editorial) {
        super.guardar(editorial);
    }

    public void modificarEditorial(Editorial editorial) {
        super.actualizar(editorial);
    }

    public void eliminarEditorial(Editorial editorial) {
        super.eliminar(editorial);
    }

    public List consultarTablaEditorial() {
        super.conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e")
                .getResultList();
        super.desconectar();
        return editoriales;
    }

    public Editorial buscarEditorialPorNombre(String nombreE) {
        super.conectar();
        Editorial editorial = (Editorial) em.createQuery(
                "SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre",
                Editorial.class)
                .setParameter("nombre", nombreE).getSingleResult();
        super.desconectar();
        return editorial;
    }
    
    public Editorial buscarEditorialPorId(Integer idE) {
        super.conectar();
        Editorial editorial = (Editorial) em.createQuery(
                "SELECT e FROM Editorial e WHERE e.id LIKE :id",
                Editorial.class)
                .setParameter("id", idE).getSingleResult();
        super.desconectar();
        return editorial;
    }
}
