
package funciones;


public class funcionesgenerales {
    
    
    public String removerAcentos(String palabraOrigen){
        String palabraRetorno= palabraOrigen.toLowerCase();
        String conAcentos="áéíóúú";
        String sinAcentos="aeiouu";
        
        int ejemplares=conAcentos.length();
        for(int i= 0; i< ejemplares; i++){
            palabraRetorno= palabraRetorno.replace(conAcentos.charAt(i),sinAcentos.charAt(i));
        }
        return palabraRetorno;
    }
}
