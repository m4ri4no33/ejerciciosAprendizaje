package principal;

import principal.servicio.ProductoServicio;

/**
 *
 * @author Mariano Benegas
 */
public class MainClassTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        ProductoServicio productoServicio = new ProductoServicio();

        productoServicio.modificarProducto();

    }

}
