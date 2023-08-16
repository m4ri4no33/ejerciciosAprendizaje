package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.persistencia.ClienteDAO;

/**
 *
 * @author Mariano Benegas
 */
public class ClienteServicio {

    private final ClienteDAO dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ClienteServicio() {
        this.dao = new ClienteDAO();
    }

    public List consultarTablaCliente() throws Exception {
        List<Cliente> clientes = null;
        try {
            clientes = dao.consultarTablaClientes();
        } catch (Exception e) {
            System.out.println("Error en consulta tabla Cliente");
        }
        return clientes;
    }

    public void crearCliente() throws Exception {
        System.out.println("A continuacion ingresaremos un Cliente");
        System.out.println("Ingrese nombre");
        String nombreC = leer.next();
        System.out.println("Ingrese apellido");
        String apellidoC = leer.next();
        System.out.println("Ingrese el numero de documento nacional");
        Long dni = leer.nextLong();
        System.out.println("Ingrese un numero de telefono");
        String telefono = leer.next();
        try {
            if (nombreC == null) {
                System.out.println("Debe ingresar un nombre");
            }
            if (apellidoC == null) {
                System.out.println("Debe ingresar un apellido");
            }
            if (dni == null) {
                System.out.println("Debe ingresar un dni");
            }
            if (telefono == null) {
                System.out.println("Debe ingresar un telefono");
            }
            Cliente cliente = new Cliente();
            cliente.setNombre(nombreC);
            cliente.setApellido(apellidoC);
            cliente.setDocumento(dni);
            cliente.setTelefono(telefono);
            dao.guardarCliente(cliente);
            System.out.println("Se creo un nuevo Cliente");
        } catch (Exception e) {
            System.out.println("No se cargo el Cliente");
        }
    }

    public void modificarCliente() throws Exception {

        System.out.println("A continuacion modificaremos un Cliente");
        System.out.println("Ingrese numero de documento");
        Long dni = leer.nextLong();
        try {
            if (dni == null || dni == 0) {
                System.out.println("Debe ingresar un DNI valido");
            }
            Cliente aux = dao.buscarClientePorDni(dni);
            System.out.println("Modificacion: nombre completo");
            String nombreC = leer.next();
            System.out.println("Modificacion: apellido");
            String apellidoC = leer.next();
            System.out.println("Modificacion: numero de telefono");
            String telefono = leer.next();

            if (nombreC == null) {
                System.out.println("Debe ingresar un nombre");
            }
            if (apellidoC == null) {
                System.out.println("Debe ingresar un apellido");
            }
            if (telefono == null) {
                System.out.println("Debe ingresar un telefono");
            }

            aux.setNombre(nombreC);
            aux.setApellido(apellidoC);
            aux.setDocumento(dni);
            aux.setTelefono(telefono);
            dao.guardarCliente(aux);
            System.out.println("Se modifico el Cliente Ingresado");
        } catch (Exception e) {
            System.out.println("Verifique no modifico el Cliente");
        }
    }

    public void eliminarCliente() throws Exception {
        System.out.println("PRECAUCION eliminara un CLIENTE");
        System.out.println("Ingrese DNI del cliente a buscar");
        Long dni = leer.nextLong();
        try {
            if (dni == null || dni == 0) {
                throw new Exception("Debe Ingresar un dni valido");
            }
            if (dao.buscarClientePorDni(dni) == null) {
                System.out.println("No existe el Cliente");
            } else {
                Cliente cliente = (Cliente) dao.buscarClientePorDni(dni);
                dao.eliminarCliente(cliente);
                System.out.println("Se elimino el Cliente");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar en Cliente");
        }
    }

    public void buscarClientePorApellido(String apellidoC) throws Exception {
        try {
            if (apellidoC == null || apellidoC == "") {
                System.out.println("Debe Ingresar un apellido");
            }
            List<Cliente> clientes = dao.buscarClientePorApellido(apellidoC);
            for (Cliente cliente : clientes) {
                System.out.println(cliente.toString());
            }
        } catch (Exception e) {
            System.out.println("Error en consulta tabla");
        }
    }

    public Cliente buscarClientePorId(Integer idC) throws Exception {
        Cliente cliente = new Cliente();
        try {
            if (idC == null || idC == 0) {
                System.out.println("Debe ingresar un id valido");
            }
            cliente = dao.buscarClientePorId(idC);
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por Id");
        }
        return cliente;
    }

    public Cliente buscarClientePorDni(Long dni) throws Exception {
        Cliente cliente = new Cliente();
        try {
            if (dni == null || dni == 0) {
                System.out.println("Debe ingresar un DNI valido");
            }
            cliente = dao.buscarClientePorDni(dni);
        } catch (Exception e) {
            System.out.println("Error al buscar Cliente 1");
        }
        return cliente;
    }
}
