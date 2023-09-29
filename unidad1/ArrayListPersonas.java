
package temaarrays;
import java.util.ArrayList;


public class ArrayListPersonas {

    
    public static void main(String[] args) {
        ArrayList<persona>listaPersonas= new ArrayList<>();
        listaPersonas.add(new persona(1,"beni",15));
        listaPersonas.add(new persona(2,"ana",17));
        listaPersonas.add(new persona(3,"juan",25));
        
        //System.out.println("imprime las personas:"+ listaPersonas);
        System.out.println("------------FOR---------");
        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println("contenido:"+ listaPersonas.get(i).getNombre());
        }
        System.out.println("---------- FOR EACH---------------");
        for(persona persi:listaPersonas){
            System.out.println("contenido:"+ persi.getNombre());
        }
    }
    
}
