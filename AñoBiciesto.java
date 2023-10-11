//AnO BICIESTO EN JAVA
//PROGRAMA PARA COMPROBAR SI UN AnO ES BICIESTO
//UN AnO ES BICIESTO SI ES DIVISIBLE POR 4 Y NO LO ES POR 100 O SI ES DIVISIBLE POR 400

import java.util.*;

public class AñoBiciesto {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.println("Introduzca año: ");
        año = sc.nextInt();

        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0){
            System.out.println("Es un año biciesto");
        }
        else{
            System.out.println("No es año Biciesto");
        }

        sc.close();
    }
    
}
