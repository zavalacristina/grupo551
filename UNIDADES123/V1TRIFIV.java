
package practica.pkg1;

import java.util .Scanner;
public class Practica1 {

             
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("introdusca numero");
        
int num=input.nextInt();
if (num % 3==0 && num% 5 == 0){
    System.out.println("three y five");
    
}else if(num % 3== 0){
    System.out.println("three");
    
}else if (num % 5== 0){
    System.out.println("five");
    }else{
    System.out.println("no es multiplo de 3 ni de 5");
}
    }
}
    
    

