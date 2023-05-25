
package v4trifiv;

import conversionesMultiples.*;
import java.util.Scanner;
public class V4TRIFIV {

    
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
        int numero;
        System.out.println("introduce numero :");
        numero=entrada.nextInt();
          varibalesmultiplo variableMultiplo=new varibalesmultiplo();
        variableMultiplo.retornanumero(numero);
        System.out.println( variableMultiplo.retornanumero(numero));
        
    }
    
}
