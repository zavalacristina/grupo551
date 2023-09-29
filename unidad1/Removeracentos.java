
package removeracentos;

import funciones.funcionesgenerales;
public class Removeracentos {

  
    public static void main(String[] args) {
        funcionesgenerales palabra= new funcionesgenerales();
        String miPalabra;
        miPalabra=palabra.removerAcentos("Paralilepípedos");
        System.out.println(miPalabra);
        
    }
    
}
