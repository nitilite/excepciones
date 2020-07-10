
package division;
import java.util.Scanner;
/**
 *
 * @author fvp
 */
public class ClaseDivision {
    public static void main(String[] args){
        try{
            //codigo fuente
            int valor1, valor2, resultado;
            Scanner entrada = new Scanner(System.in);

            System.out.print("Dame el primer valor:   ");
            valor1= entrada.nextInt();

            System.out.print("Dame el segundo valor:   ");
            valor2=entrada.nextInt();


            resultado = valor1 / valor2;
            System.out.print("Division es igual a: " + resultado);
        } catch (Exception e ){
            //Comportamiento del programa cuando nuestro error se ejecute
            System.out.println("ERROR!!!!!  "+ e);
        }
        
    }
            
}
