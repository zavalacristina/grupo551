
package _6mayorymenor;
import MAYORYMENOR.*;
import java.util.Scanner;

public class _6MAYORYMENOR {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
      int numero;
        System.out.println("introduce un numero:");
        numero=entrada.nextInt();
         EMAYORMENOR variabledad=new EMAYORMENOR();
         variabledad.retornamultiplo(numero);
         System.out.println(variabledad.retornamultiplo(numero));
    }
    
}
