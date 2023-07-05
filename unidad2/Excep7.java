
package excep7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Excep7 {
//IOEException
   
    public static void main(String[] args) {
        try{
            BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("ingresa numero uno:");
            int num1= Integer.parseInt(reader.readLine());
            System.out.println("ingresa numero dos:");
            int num2=Integer.parseInt(reader.readLine());
            int result= multiplyUsingSum(num1,num2);
            System.out.println("el resultado es:"+ result);
            
        }catch(IOException e){
            System.out.println("error entrada/salida:"+e.getMessage());
    }catch (NumberFormatException e){
            System.out.println("error formato: ingrese solo numero entero:");
            
    }
    
}
    public static int multiplyUsingSum(int num1,int num2){
        int result=0;
        for(int i= 0; i< num2; i++){
            result += num1;
        }
        return result;
    }
}

