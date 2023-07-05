
package excep8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//FileNotFoundException
public class Excep8 {

   
    public static void main(String[] args) {
        try{
             Scanner scanner = new Scanner(new File("input.txt"));
            int divid= scanner.nextInt();
            int divis=scanner.nextInt();
            int result=divid/divis;
            System.out.println("wl resultado es:"+result);
            scanner.close();
            
        }catch(FileNotFoundException e){
            System.out.println("error: archivo no encontrado");
        }catch(ArithmeticException e){
            System.out.println("error:division cero");
        }
    }
    
}
