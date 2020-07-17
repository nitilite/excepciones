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
public class CustomException extends Exception {
    /* Programar el codigo fuente que se debe ejecutar cuando el Catch se activa
    Este fuente son operaciones propias, una resolucion de el problema que se presenta.
    */
    
    public static final long serialVersionUID = 700L;
    
    public CustomException(String mensaje){
        super(mensaje);
    }
    
}
