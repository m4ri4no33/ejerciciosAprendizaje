package javaapplication76;

/**
 *
 * @author Mariano Benegas
 */
public class JavaApplication76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        String nombre = null;

        try {
            if (!nombre.equals(null)) {
                p1.setNombre(nombre);
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }

}
