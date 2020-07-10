
package nombres;
import java.util.Scanner;

public class ClaseNombres {
    public static void main(String[] args){
        String mensajes[] = {"Luis","Carlos","David","Allen"};
        int cont;
        try{
            for(cont=0; cont <=3; cont++)
                System.out.println(mensajes[cont]);
         
                        
        }
        catch (ArrayIndexOutOfBoundsException excep) {
            System.out.println("El arreglo se ha desbordado de su indice" + excep);
        }
    }
}
