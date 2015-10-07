
package boletin2_1c;

import java.util.Scanner;


public class Boletin2_1c {

  
   
    public static void main(String[] args) {
        float base, altura, area;
        Scanner obx = new Scanner (System.in);
        System.out.println("teclea base");
        base=obx.nextFloat();  
        System.out.print(System.getProperty("line.separator"));
        System.out.println("teclea altura");
        altura=obx.nextFloat();
        area=base*altura;
          System.out.println("area= "+area);
       
       
             
    }
    
}

