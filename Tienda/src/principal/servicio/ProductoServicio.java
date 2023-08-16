package principal.servicio;

import java.util.Scanner;
import principal.entidades.Fabricante;
import principal.entidades.Producto;
import principal.persistencia.FabricanteDAO;
import principal.persistencia.ProductoDAO;

/**
 *
 * @author Mariano Benegas
 */
public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ProductoDAO dao;
    private FabricanteDAO daoF;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    public void crearProducto() throws Exception {

        System.out.println("Ingrese nombre de producto");
        String nombre = leer.next();
        System.out.println("Ingrese el precio del producto");
        Double precio = leer.nextDouble();
        System.out.println("Ingrese el codigo del fabricante");
        Integer codigof = leer.nextInt();

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre de producto");
            }

            if (precio >= 0) {
                throw new Exception("Valor no valido, Ingrese un valor superior a 0,01");
            }

            if (codigof >= 0) {
                throw new Exception("El codigo no corresponde a un Fabricante");
            }

            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigof);

            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }

    }
    // h) Editar un producto con datos a elección.

    public void modificarProducto() throws Exception {

        System.out.println("Ingrese codigo de producto a modificar");
        Producto aux = dao.buscarProductoPorCodigo(leer.nextInt());

        System.out.println("A continuacion nodificara un producto");
        System.out.println("Ingrese nuevo nombre de producto");
        String nombre = leer.next();
        System.out.println("Ingrese el nuevo precio del producto");
        Double precio = leer.nextDouble();
        System.out.println("Ingrese el codigo del fabricante");
        Fabricante auxFabricante = null;
        
        do {

            try {
                auxFabricante = daoF.buscarFabricantePorCodigo(leer.nextInt());

            } catch (Exception e) {
                System.out.println("Ingrese un fabricante valido");
            }
        } while (auxFabricante != null);
        
        
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe ingresar un nombre");
            }

            if (precio == null) {
                throw new Exception("Valor no valido, Ingrese un valor superior a 0,01");
            }

            aux.setNombre(nombre);
            aux.setPrecio(precio);
            aux.setCodigoFabricante(auxFabricante.getCodigo());

            dao.guardarProducto(aux);

        } catch (Exception e) {
            throw e;
        }

        /* a) Lista el nombre de todos los productos que hay en la tabla producto.
        b) Lista los nombres y los precios de todos los productos de la tabla producto.
        c) Listar aquellos productos que su precio esté entre 120 y 202.
        d) Buscar y listar todos los Portátiles de la tabla producto.
        e) Listar el nombre y el precio del producto más barato.
        f) Ingresar un producto a la base de datos.
        g) Ingresar un fabricante a la base de datos
        h) Editar un producto con datos a elección.*/
    }
}
