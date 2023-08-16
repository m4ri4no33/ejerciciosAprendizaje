package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

/**
 *
 * @author Mariano Benegas
 */
public final class PrestamoDAO extends DAO<Prestamo> {

    public void guardarPrestamo(Prestamo prestamo) {
        super.guardar(prestamo);
    }

    public void modificarPrestamo(Prestamo prestamo) {
        super.actualizar(prestamo);
    }

    public void eliminarPrestamo(Prestamo prestamo) {
        super.eliminar(prestamo);
    }

    public List consultarTablaPrestamo() {
        super.conectar();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p")
                .getResultList();
        super.desconectar();
        return prestamos;
    }

    public Prestamo buscarPrestamoPorId(Integer id) {
        super.conectar();
        Prestamo prestamo = (Prestamo) em.createQuery("SELECT p FROM Prestamo p WHERE p.id LIKE :id",
                Prestamo.class)
                .setParameter("id", id).getSingleResult();
        super.desconectar();
        return prestamo;
    }

    public List buscarPrestamosPorCliente(Long dni) {
        super.conectar();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo"
                + " p JOIN p.cliente c WHERE c.documento = :documento")
                .setParameter("documento", dni).getResultList();
        super.desconectar();
        return prestamos;
    }

    public List buscarPrestamosPorLibro(Long icbn) {
        super.conectar();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo"
                + " p JOIN p.libro l WHERE l.icbn = :icbn")
                .setParameter("icbn", icbn).getResultList();
        super.desconectar();
        return prestamos;
    }
}
