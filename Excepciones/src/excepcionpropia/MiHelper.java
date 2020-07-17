/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionpropia;

/**
 *
 * @author fvp
 */
public class MiHelper {
    public MiHelper(){
        
    }
    
    public void validarPassword(String pass, String rpass) throws CustomException{
        if(!pass.equals(rpass)){
            throw new CustomException("Los campos de los password no coinsiden..");            
        }
        
        if(pass.length()< 8){
            throw new CustomException("El password no puede ser menor a 8 caracteres...");
        }
        
       /*  Si cumple con mayusculas y minisculas 
        Si cumple con integrar un simbolo
        Si cumple que no contenga palabras consecutivas
        Si cumple que no sean caracteres parecidos al usuario
        */
    }
}
