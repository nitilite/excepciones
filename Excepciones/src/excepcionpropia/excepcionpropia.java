
package excepcionpropia;

/**
 *
 * @author fvp
 */
public class excepcionpropia {
    public static void main(String[] args ){
    String user, pass, repass;
    
    user="aviquez";
    pass="12345";
    repass="12345";
    
    MiHelper h= new MiHelper();
    
    try{
        h.validarPassword(pass,repass);
        
    }catch(CustomException e)  {
        System.out.println("No se puede registrar el usuario. Debido al siguiente problema: " + e.getMessage());
    }
            
    }
}
