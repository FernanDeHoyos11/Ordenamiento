/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

public class MetodosOrdenamiento {
    
    public static void Burbuja(int[] arreglo) {
        boolean intercambiado = true;

        for (int i = 0; i < arreglo.length - 1 && intercambiado; i++) {
            intercambiado = false;
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;
                }
            }
        }
    }
    
    public static void Shell(int[] arreglo) {
        int incremento = arreglo.length;
        while (incremento > 1) {
            incremento = (int) (incremento / 2.2);
            for (int i = incremento; i < arreglo.length; i++) {
                int valorActual = arreglo[i];
                int j = i - incremento;
                while (j >= 0 && arreglo[j] > valorActual) {
                    arreglo[j + incremento] = arreglo[j];
                    j -= incremento;
                }
                arreglo[j + incremento] = valorActual;
            }
        }
    }
    
    public static void Seleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            if (i != indiceMinimo) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = temp;
            }
        }
    }
    
    public static void Inserccion(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int valorActual = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > valorActual) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }

            arreglo[j + 1] = valorActual;
        }
    }
}
