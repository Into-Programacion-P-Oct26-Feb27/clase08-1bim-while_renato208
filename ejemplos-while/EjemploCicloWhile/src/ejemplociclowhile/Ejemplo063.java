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

public class Ejemplo063 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean  bandera = true;
        String pais;
        String capital;
        String cadena_final = "";
        
        while(bandera == true){
            System.out.println("Ingrese un país:");
            pais = entrada.nextLine();
            System.out.printf("Ingrese la capital de %s:\n", pais);
            capital = entrada.nextLine();
            cadena_final = String.format("%s%s - %s\n",
                    cadena_final, pais, capital);
            
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
        }
        System.out.printf("%s\n", cadena_final);
        
    }
    
}

/*

*/
