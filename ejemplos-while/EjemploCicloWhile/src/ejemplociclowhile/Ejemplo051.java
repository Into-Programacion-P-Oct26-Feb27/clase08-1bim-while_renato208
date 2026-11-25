/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int limite = 3;
        int contador = 1;
        double suma_total = 0;

        double promedio_final;
        double calificacion;
        
        String cadena_final = "Notas ingresadas son:\n";
        String nombre;
        String apellido;

        System.out.println("Ingrese las notas de los estudiantes de su "
                + "materia");
        System.out.println("Ingrese el nombre del estudiante:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del estudiante:");
        apellido = entrada.nextLine();
        
        cadena_final = String.format("%sNombre del estudiante: %s\n"
                + "Apellido del estudiante: %s\n",
                cadena_final, nombre, apellido);

        while (contador <= limite) {
            System.out.printf("Ingrese calificación "
                    + "número %d\n", contador);
            calificacion = entrada.nextDouble();
            entrada.nextLine();
            cadena_final = String.format("%s%.2f\n", 
                    cadena_final, calificacion);
            suma_total = suma_total + calificacion;
            // contador
            contador = contador + 1;
        }
        
        cadena_final = String.format("%sLa suma de notas es: %.1f\n", 
                cadena_final, suma_total);
        promedio_final = suma_total / limite;
        
        cadena_final = String.format("%sPromedio es: %.2f\n",
                cadena_final, promedio_final);

        // System.out.printf("El promedio final es %f\n", promedio_final);
        System.out.printf("%s\n", cadena_final);

    }
}

/*
La cadena final en este ejemplo nos permite acumular valores para que al final
se presenten :)
Esta nos permite mas eficiencia para presentar los valores que estan solo en
el ciclo
*/