package principal.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import principal.entidades.Producto;

/**
 *
 * @author Mariano Benegas
 */
public final class ProductoDAO extends DAO{
    
    
    public void guardarProducto(Producto producto ) throws Exception{
        try {
            if (producto == null) {
                throw new Exception("El producto a cargar no contiene datos");              
            }
            
            String sql = "INSERT INTO Productos (Nombre,precio,codigoFabricante)"
                    + "VALUES (  '" + producto.getNombre() + "' , '" + producto.getPrecio() 
                    + "' , '" + producto.getCodigoFabricante() + " ; " ;
            insertarModificarEliminar(sql);
        } catch (Exception e) {
        } finally {
        }
    }
    
     public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE Producto SET "
                    + " nombre = '" + producto.getNombre() + "' , precio = '" + producto.getPrecio() 
                    + "' , codigo_fabricante = " + producto.getCodigoFabricante()
                    + " WHERE codigo = '" + producto.getCodigo(resultado.getInt(1)) + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
     
     public void eliminarProducto(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM Producto WHERE codigo = " + codigo + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE codigo = " + codigo + ";";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                
                //Usuario usuario = usuarioService.buscarUsuarioPorId(idUsuario);
                //mascota.setUsuario(usuario);
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM Producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarNombresProductos() throws Exception {
        try {
            String sql = "SELECT nombre FROM Producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarNombresPrecios() throws Exception {
        try {
            String sql = "SELECT nombre,precios FROM Producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    //c) Listar aquellos productos que su precio esté entre 120 y 202.
    //consulta con valores ingresados por usuarios, se los pasamos por parametros
    public Collection<Producto> listarProductosPorValor(double min,double max) throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE precio BETWEEN " + min + " AND " + max + "";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    //d) Buscar y listar todos los Portátiles de la tabla producto.
    // modificacion para buscar por frase le pasamos frase a buscar
    public Collection<Producto> listarPorFrase(String frase) throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE nombre LIKE '%" + frase +"%'";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    //e) Listar el nombre y el precio del producto más barato.
    public Collection<Producto> listarNombresPreciosMenor() throws Exception {
        try {
            String sql = "SELECT nombre,MIN(precios) FROM Producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
}
    

