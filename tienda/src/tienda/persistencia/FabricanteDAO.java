
package tienda.persistencia;

import tienda.entidades.Fabricante;

/**
 *
 * @author Rosi-PC
 */
public class FabricanteDAO extends DAO{
    
    
     public void savePerson(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("El fabricante no puede ser nula");
            }

            String template = "INSERT INTO  VALUES (NULL, '%s', '%s', '%s');";
            String sql = String.format(template, fabricante.getCodigo(), fabricante.getNombre());
            System.out.println("STATEMENT");
            System.out.println(sql);

            insertModifyDelete(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al guardar persona");
        }
    }
    
  
     
}
