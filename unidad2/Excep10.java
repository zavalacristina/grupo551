
package excep10;
//ClassCatsException

public class Excep10 {

    
    public static void main(String[] args) {
      try{
          int nume=10;
          Object deno="2"; //classCastException
          int result = nume/ (int)deno;
          System.out.println("el resultado es:"+result);
          
      }catch(ClassCastException ex){
          System.out.println("se produjo un ClaaaCastException:"+ex.getMessage());
          
      }
      
    }
    
}
