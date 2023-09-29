
package temaarrays;

import java.util.ArrayList;
public class arrayListSeriesTv {

    
    public static void main(String[] args) {
        ArrayList<String>listaSeries = new ArrayList<>();
        listaSeries.add("breaking bad");
        listaSeries.add("friends");
        listaSeries.add("viking");
        
        System.out.println(listaSeries);
        
        listaSeries.remove("friends");
        System.out.println(listaSeries);
        
        boolean containFriends =listaSeries.contains("friends");
        System.out.println("la lista contiene a friends:"+containFriends);
        
        int tamanno = listaSeries.size();
        System.out.println("el tamaño del ArrayList es:"+ tamanno);
        
        //declarar diversos tipos de ArrayList
        ArrayList<Integer>listaInteger= new ArrayList<>();
        ArrayList<Double> listaDouble = new ArrayList<>();
        ArrayList<Boolean>listaBooleanos= new ArrayList<>();
        
    }
     
}
