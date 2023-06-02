
package Entidad;
/*
 * @author Mariano Benegas
 */
public class TiendaHashMap {

   private String articulo;
   private String tipo;
   private Double precio;

    public TiendaHashMap() {
    }

    public TiendaHashMap(String articulo, String tipo, Double precio) {
        this.articulo = articulo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "TIENDA{" + "\nARTICULO : " + articulo + "\nTIPO/RUBRO: " + tipo +
                "\nPRECIO: $ " + precio + '}';
    }
   
   
  
}
