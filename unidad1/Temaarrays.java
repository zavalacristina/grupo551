
package temaarrays;
import java.util.Scanner;
import java.util.Scanner;


public class Temaarrays {

    
    public static void main(String[] args) {
        //guardar las ventas de 10 dias en un arreglo 
        //y determinar cuales son mayores a 2000 (inclusive)
        double ventas[]= new double [10];
        Scanner entrada= new Scanner(System.in);
        System.out.println("*********Ventas mayores a 2000******");
        System.out.println("");
        System.out.println("ingrese las 10 ventas del mes");
        
        //llenar el arreglo
        for (int i = 0; i <= ventas.length -1; i++) {
            System.out.println("ingrese la venta:"+ (i+1)+ " ");
            ventas[i] = entrada.nextDouble();
            
        }
        //seterminar cuales ventas en el arreglo son mayores o iguales 
        //a 2000
        ventasMayores2000(ventas);
    }
    public static void ventasMayores2000(double x[]){
        int j=0;
        int total=0;
        double acomuladorVentas=0;
        System.out.println("estas son las ventas mayores o iguales a 2000");
        
        //recorrer el arreglo
        while(j <10){
            if(x[j] >=2000){
                System.out.println("$"+ x[j]);
                total ++;
                acomuladorVentas=acomuladorVentas+x[j];
            }
            j++;
            
        }
        System.out.println("el totalde las ventas >=2000:"+total);
        System.out.println("el acomulado total es:"+ acomuladorVentas);
    }
}
