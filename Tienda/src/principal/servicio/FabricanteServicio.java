package principal.servicio;

import principal.entidades.Fabricante;
import principal.persistencia.FabricanteDAO;

/**
 *
 * @author Mariano Benegas
 */
public class FabricanteServicio {
    private FabricanteDAO dao;

    public FabricanteServicio() {
        this.dao = new FabricanteDAO();
    }

    public void crearFabricante(int codigo, String nombre) throws  Exception {
        try {
        
            if (codigo < 0) {
                throw new Exception("Verificar codigo");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre de fabricante");
            }
            
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            

            dao.guardarFabricante(fabricante);

        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
}
