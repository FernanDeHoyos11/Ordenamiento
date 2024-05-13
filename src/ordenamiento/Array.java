/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Array {
    
    public static int[] CrearArray(Scanner scanner){
        int[] arreglo = new int[10];
        int i = 0;
        System.out.println("Ingrese los elementos del arreglo: ");
        do {            
             try {
               arreglo[i] = Integer.parseInt(scanner.next());
               i++;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, solo numeros");
            }
        } while ( i<10 );
        return arreglo;
    }
}
