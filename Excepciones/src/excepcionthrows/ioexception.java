
package excepcionthrows;
import java.io.*;

/**
 *
 * @author fvp
 */
public class ioexception {
    public static void main(String [] args) throws IOException, ArithmeticException
    {
        char caracter;
        
        caracter = (char) System.in.read();
        System.out.println("Dato leido: " + caracter + ". ");
        
        
    }
}
