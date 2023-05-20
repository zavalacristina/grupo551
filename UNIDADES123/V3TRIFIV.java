
package v3trifiv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V3TRIFIV {

    
      public static void main(String[] args) throws IOException {
         //Declaracion de variables 
       BufferedReader BufEntrada =new BufferedReader(new InputStreamReader(System.in));
               int numero = 0;  
               //entrada datos 
               System.out.println("Dame el número");
               numero = Integer.parseInt(BufEntrada.readLine());
         //salida de datos
         
        System.out.println(retornaMultiplo(numero));
    }
    public static String retornaMultiplo(int num){
        int mult3;
        int mult5;
                //procesar datos
                mult3= num % 3; 
                mult5 = num % 5; 
        if (mult3==0 && mult5== 0){
             return "TRIFIV";
         } else if(mult3==0){
              return "TRI";
         } else if(mult5==0){
             return "FIV";  
         }
        return "no es multiplo de 3,5";
    }
}
    
    

