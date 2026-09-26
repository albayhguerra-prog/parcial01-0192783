import java.util.Scanner;
public class Ejercicio2 {

    final static int cantidadMaquinas = 4;
    final static int cantidadDias = 5;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] maquinaDias = new int[cantidadMaquinas][cantidadDias];
        int sumaTotal = 0;


        for (int i = 0; i < cantidadMaquinas; i++) {
            for (int j = 0; j < cantidadDias; j++) {
                int dato;
                do {
                    System.out.print("Ingrese la producción de la máquina " + (i + 1) + " para el día " + (j + 1) + ": ");
                    dato = sc.nextInt();
                    if (dato < 0) {
                        System.out.println("La producción no puede ser negativa, vuelva a intentarlo.");
                    }
                } while (dato < 0);
                maquinaDias[i][j] = dato;
            }
        }
        int[] sumaMaquinas = new int[cantidadMaquinas];
        for (int i = 0; i < cantidadMaquinas; i++) {
            for (int j = 0; j < cantidadDias; j++) {
                sumaMaquinas[i] += maquinaDias[i][j];
            }
        }

        int[] sumaDias = new int[cantidadDias];
        for (int j = 0; j < cantidadDias; j++) {
            for (int i = 0; i < cantidadMaquinas; i++) {
                sumaDias[j] += maquinaDias[i][j];
            }
        }

        int mayorProduccion = 0;
        for (int i = 0; i < cantidadMaquinas; i++) {
            if (sumaMaquinas[i] > sumaMaquinas[mayorProduccion]) {
                mayorProduccion = i;
            }
        }

        int menorProduccion = 0;
        for (int j = 1; j < cantidadDias; j++) {
            if (sumaDias[j] < sumaDias[menorProduccion]) {
                menorProduccion = j;
            }
        }

        int menorA20 = 0;
        for (int i = 0; i < cantidadMaquinas; i++) {
            for (int j = 0; j < cantidadDias; j++) {
                if (maquinaDias[i][j] < 20) {
                    menorA20++;
                }
            }
        }
        System.out.println("La suma total de la producción es: " + sumaTotal);
        System.out.println("La suma de cada máquina es:");
        for (int i = 0; i < cantidadMaquinas; i++) {
            System.out.println("Máquina " + (i + 1) + ": " + sumaMaquinas[i]);
        }
        System.out.println("La suma de cada día es:");
        for (int j = 0; j < cantidadDias; j++) {
            System.out.println("Día " + (j + 1) + ": " + sumaDias[j]);
        }
        System.out.println("La máquina con mayor producción es: " + (mayorProduccion + 1));
        System.out.println("El día con menor producción es: " + (menorProduccion + 1));
        System.out.println("El número de días en los que la producción fue menor a 20 es: " + menorA20);
        System.out.println("Listado de producciones:");
        for (int i = 0; i < cantidadMaquinas; i++) {
            for (int j = 0; j < cantidadDias; j++) {
                System.out.println("Máquina " + (i + 1) + ", Día " + (j + 1) + ": " + maquinaDias[i][j]);
            }
            System.out.println("Disfrute de mi sufrimiento, si no funciona es culpa de java, no mía.");
        }
    }
}
