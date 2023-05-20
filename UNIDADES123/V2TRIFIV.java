
package v2trifiv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V2TRIFIV {

   
     public static void main(String[] args) throws IOException {
         //Declaracion de variables 
       BufferedReader BufEntrada =new BufferedReader(new InputStreamReader(System.in));
               int numero = 0;  
               int mult3;
               int mult5;
               //entrada datos 
               System.out.println("Dame el número");
               numero = Integer.parseInt(BufEntrada.readLine());
               //procesar datos
               
               mult3= numero % 3; 
               mult5 = numero % 5;
         //salida de datos 
         if (mult3==0 && mult5== 0){
             System.out.println("TRIFIV");
         } else if(mult3==0){
              System.out.println("TRI");
         } else if(mult5==0)
             System.out.println("FIV");
             
         }
               
                      
    }

    
    

