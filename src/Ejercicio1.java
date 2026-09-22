
import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
    
    int[] sectores = new int[10];
    int sumaTotal = 0;

    Scanner sc = new Scanner (System.in);

    System.out.println("Ingrese el primer consumo:");
    if (sectores[0]>0) {
        sectores[0] = sc.nextInt();
    } else {
        System.out.println("Ingrese nuevamente el primer consumo:");
         sectores[0] = sc.nextInt();
    }
     System.out.println("Ingrese el segundo consumo:");
    if (sectores[1]>0) {
        sectores[1] = sc.nextInt();
    } else {
        System.out.println("Ingrese nuevamente el segundo consumo:");
         sectores[1] = sc.nextInt();
    }
     System.out.println("Ingrese el tercer consumo:");
    if (sectores[2]>0) {
        sectores[2] = sc.nextInt();
    } else {
        System.out.println("Ingrese nuevamente el tercer consumo:");
         sectores[2] = sc.nextInt();
    }
     System.out.println("Ingrese el cuarto consumo:");
    if (sectores[3]>0) {
        sectores[3] = sc.nextInt();
    } else {
        System.out.println("Ingrese nuevamente el cuarto consumo:");
         sectores[3] = sc.nextInt();
    }
}
}