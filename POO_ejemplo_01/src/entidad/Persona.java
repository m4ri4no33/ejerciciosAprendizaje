
package entidad;

/**
 *
 * @author Mariano Benegas
 */
public class Persona {

    public String nombre;
    public String genero;
    public int fechaNacimiento;
    
    public Persona(){
    }
    
    public Persona(String nombre, String genero, int fechaNacimiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }  
   

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
     @Override
    public String toString() {
        return "Persona{" + "nombre =" + nombre + ", genero =" + genero + ", fechaNacimiento =" + fechaNacimiento + '}';
    }


}
