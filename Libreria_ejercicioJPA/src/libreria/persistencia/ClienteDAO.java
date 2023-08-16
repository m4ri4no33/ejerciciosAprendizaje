package libreria.persistencia;

import java.util.List;
import libreria.entidades.Cliente;

/**
 *
 * @author Mariano Benegas
 */
public final class ClienteDAO extends DAO<Cliente> {

    public void guardarCliente(Cliente cliente) {
        super.guardar(cliente);
    }

    public void modificarCliente(Cliente cliente) {
        super.actualizar(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        super.eliminar(cliente);
    }

    public List consultarTablaClientes() {
        super.conectar();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c")
                .getResultList();
        super.desconectar();
        return clientes;
    }

    public List buscarClientePorApellido(String apellidoC) {
        super.conectar();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.apellido LIKE :apellido",
                Cliente.class)
                .setParameter("apellido", apellidoC).getResultList();
        super.desconectar();
        return clientes;
    }

    public Cliente buscarClientePorId(Integer id) {
        super.conectar();
        Cliente cliente = (Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.id LIKE :id",
                Cliente.class)
                .setParameter("id", id).getSingleResult();
        super.desconectar();
        return cliente;
    }

    public Cliente buscarClientePorDni(Long documento) {
        super.conectar();
        Cliente cliente = (Cliente) em.createQuery("SELECT c FROM Cliente"
                + " c WHERE c.documento = :documento",
                Cliente.class)
                .setParameter("documento", documento).getSingleResult();
        super.desconectar();
        return cliente;
    }
}
