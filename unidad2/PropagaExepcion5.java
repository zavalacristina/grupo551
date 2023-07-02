
package propagaexepcion5;


public class PropagaExepcion5 {
    public static int miMetodo(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
            
        }
        int c= a/b;
        return c;

    
        
    }
    public static void main(String[] args) {
        try{
            int division= miMetodo(10,0);
            System.out.println(division);
            
            
        }catch(ArrayStoreException e){
            System.out.println("excepcion aritmetica arrojada:");
            e.printStackTrace();
        }
    }
    
}
