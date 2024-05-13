/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String messageOne = "Array original\n";
        String messageTwo = "\nArray ordenado\n";
        int[] arreglo = {};
        int opcion = 0;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una opcion: \n"
                        + "1. Burbuja \n"
                        + "2. Shell \n"
                        + "3. Selección \n"
                        + "4. Inserccion \n"
                        + "0. Salir"));

                switch (opcion) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Ha salido de el programa");
                        break;
                    case 1:
                        arreglo = Array.CrearArray(scanner);
                        System.out.println(messageOne);
                        PrintArray.printArray(arreglo);
                        MetodosOrdenamiento.Burbuja(arreglo);
                        System.out.println(messageOne);
                        PrintArray.printArray(arreglo);
                        System.out.println("");
                        break;
                    case 2:
                        arreglo = Array.CrearArray(scanner);
                        System.out.println(messageOne);
                        PrintArray.printArray(arreglo);
                        MetodosOrdenamiento.Shell(arreglo);
                        System.out.println(messageTwo);
                        PrintArray.printArray(arreglo);
                        System.out.println("");
                        break;
                    case 3:
                        arreglo = Array.CrearArray(scanner);
                        System.out.println(messageOne);
                        PrintArray.printArray(arreglo);
                        MetodosOrdenamiento.Seleccion(arreglo);
                        System.out.println(messageTwo);
                        PrintArray.printArray(arreglo);
                        System.out.println("");
                        break;
                    case 4:
                        arreglo = Array.CrearArray(scanner);
                        System.out.println(messageOne);
                        PrintArray.printArray(arreglo);
                        MetodosOrdenamiento.Inserccion(arreglo);
                        System.out.println(messageTwo);
                        PrintArray.printArray(arreglo);
                        System.out.println("");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            } catch (Exception e) {
                opcion = 10;
                JOptionPane.showMessageDialog(null, "Opcion no valida, ingrese un caso valido");
            }
        } while (opcion != 0);

    }

}
