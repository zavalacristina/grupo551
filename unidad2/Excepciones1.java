
package excepciones;

import javax.swing.JOptionPane;
public class Excepciones {

    public static void main(String[] args) {
        int x,y;
        //try y catch para corregir error de letra
        try{
          x=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero 1:","solicito daots",3));  
        
        }catch (NumberFormatException n){
            System.out.println(n.getMessage()+ "no es numero ENTERO");
        }
        
    }
    
}
