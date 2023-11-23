
package pkg651partidosfutbol;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static final String nombreArchivo="partidos.txt";

    public static void main(String[] args) {
        ArrayList<PartidosFutbol> partidos = new ArrayList<PartidosFutbol>();
        
        File archivo=new File(nombreArchivo);
        Scanner s=null;
        
        try{
            
            s=new Scanner(archivo);
            while(s.hasNextLine()){  
                String Linea=s.nextLine();
                String []cortarString = Linea.split("::");
                
                //mapeo de array con objetos de la clase partidos de futbol
                PartidosFutbol partido=new PartidosFutbol();
                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGolesLocal(Integer.parseInt(cortarString[2]));
                partido.setGolesVisitante(Integer.parseInt(cortarString[3]));
                
                partidos.add(partido);
                      
        }
     
        }catch(Exception e){
            e.printStackTrace();
        }
        //partidos.forEach(System.out::println);
        System.out.println("Impresion del objeto antes de procesar");
        Iterator<PartidosFutbol> itPartidos = partidos.iterator();
        while(itPartidos.hasNext()){
            PartidosFutbol partido = itPartidos.next();
            System.out.println( partido.getEquipoLocal() + " "
                              + partido.getEquipoVisitante() + " "
                              + partido.getGolesLocal() + " "
                              + partido.getGolesVisitante());
            
        }
        System.out.println("");
        
        //Examinar partidos empatados
        itPartidos = partidos.iterator();
        while(itPartidos.hasNext()){
            PartidosFutbol partido = itPartidos.next();
            
            if(partido.getGolesLocal() !=partido.getGolesVisitante()){
                itPartidos.remove();
                
            }
        }
        System.out.println("");
        //imprimir partidos que sean empate
        System.out.println("Impresion del objeto antes de procesar");
        itPartidos= partidos.iterator();
        while(itPartidos.hasNext()){
            PartidosFutbol partido = itPartidos.next();
            System.out.println( partido.getEquipoLocal() + " "
                              + partido.getEquipoVisitante() + " "
                              + partido.getGolesLocal() + " "
                              + partido.getGolesVisitante());
            
        }
                
    }
    
}