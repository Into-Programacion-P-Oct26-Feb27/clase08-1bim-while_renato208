/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author SALASC
 */

public class Ejemplo062 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean  bandera = true;
        
        while(bandera == true){
            System.out.println("Estoy en el ciclo");
            
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
        }
        
    }
    
}

/*
En este ejercicio hacemos que el ciclo se cumpla con una variable booleana
("True / False") y que segun una condicion interna del ciclo esta cambie
de al valor contrario. Pasando de true a false.
A diferencia de los anteriores ejercicios los cuales el ciclo se cumplia
con condiciones de contadores, este es practicamente infinito hasta que el 
usuario decida lo contrario 
*/
