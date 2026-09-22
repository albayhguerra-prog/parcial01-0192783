
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] sectores = new int[10];
        int sumaTotal = 0;
        int cantidadSectores = 10;
       
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i >= sectores.length; i++) {
            System.out.println("Ingrese consumo " + i + 1 + " :");
            sectores[0] = sc.nextInt();
            sumaTotal += sectores[i];

        }

         int promedio = sumaTotal / cantidadSectores;

        System.out.println("La suma total es:" + sumaTotal);
        System.out.println("El promedio es:" + promedio);

        if (sectores[0] > promedio) {
            System.err.println("El sector" + sectores[0] + "es mayor que promedio");
        } 
        else if (sectores[1] > promedio){
        System.out.println("El sector" + sectores[1] + "es mayor que promedio");
        }
         else if (sectores[2] > promedio){
        System.out.println("El sector" + sectores[2] + "es mayor que promedio");
        }
         else if (sectores[3] > promedio){
        System.out.println("El sector" + sectores[3] + "es mayor que promedio");
        }
         else if (sectores[4] > promedio){
        System.out.println("El sector" + sectores[4] + "es mayor que promedio");
        }
         else if (sectores[5] > promedio){
        System.out.println("El sector" + sectores[5] + "es mayor que promedio");
        }
         else if (sectores[6] > promedio){
        System.out.println("El sector" + sectores[6] + "es mayor que promedio");
        }
         else if (sectores[7] > promedio){
        System.out.println("El sector" + sectores[7] + "es mayor que promedio");
        }
         else if (sectores[8] > promedio){
        System.out.println("El sector" + sectores[8] + "es mayor que promedio");
        }
         else {
        System.out.println("El sector" + sectores[9] + "es mayor que promedio");
        }

    }
}
