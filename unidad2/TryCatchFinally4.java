
package trycatchfinally;


public class TryCatchFinally {

   //finally
    public static void main(String[] args) {
        try{
            float equis = 5/0;
            System.out.println("Equis ="+ equis);
            
        
    }catch(ArithmeticException e){
            System.out.println("error: division entre cero.");
            
    }finally{
            System.out.println("a pesar de todo, se ejecuta el bloque finally.");
        }
    }
    
}
