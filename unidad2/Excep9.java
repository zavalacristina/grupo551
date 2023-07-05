
package excep9;

//ClassNotFoundException
public class Excep9 {

  
    public static void main(String[] args) {
        try{
            int divided = 10;
            int divis = 0;
            int result = divide(divided, divis);
            System.out.println("El resultado de la división es: " + result);
        } catch (ClassNotFoundException e) {
            System.out.println("¡Se produjo una ClassNotFoundException!");
            e.printStackTrace();
        }
    }
    public static int divide(int divid, int divis) throws ClassNotFoundException{
        int divisor = 0;
        if (divis == 0) {
            throw new ClassNotFoundException("Divisor no puede ser cero.");
        }
        int divided = 0;
        return divided / divis;
        
    }
      
    
}
