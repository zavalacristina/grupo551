
package stringarreglos;

public class StringArreglos {

    public static void main(String[] args) {
        //problema escribir un programa para insertar el numero de episodios de 
        //una serie de una serie "Dr House" y que nos devuelva la duracion.
        
        System.out.println("*************************");
        System.out.println("*****serie de Dr House******");
        System.out.println("****************************");
        
        int[] episodiosSerie= new int[5];
        
        episodiosSerie[0]=30;
        episodiosSerie[1]=50;
        episodiosSerie[2]=25;
        episodiosSerie[3]=60;
        episodiosSerie[4]=45;
        
        //numero de episodios
        int episodios= episodiosSerie.length;
        
        int acomulador=0;
        System.out.println("total de episodios de la seri Dr House:"+ episodios);
        for (int i = 0; i < episodiosSerie.length; i++) {
            acomulador=acomulador+episodiosSerie [i];
        }
        
        System.out.println("capitulos de duracion duracion con mas de 40 minutos:"+ acomulador);
      for (int i = 0; i < episodiosSerie.length; i++) {
          if(episodiosSerie[i] >40){
              System.out.println("episodios"+ (i+1)+":"+episodiosSerie[i]+"minutos");
          }
      }
               
           

                    
                }
            }
    
    

