
import java.util.Scanner;

public class Ejercicio1 {
     final static int cantidadSectores = 10;

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int[] sectores = new int[cantidadSectores];
        int sumaTotal = 0;

        for (int i = 0; i < cantidadSectores; i++) {
            int consumo;
            do {
                System.out.print("Ingrese consumo del sector " + (i + 1) + ": ");
                consumo = sc.nextInt();
                if (consumo < 0) {
                    System.out.println("El consumo no puede ser negativo. Intente de nuevo.");
                }
            } while (consumo < 0);
            sectores[i] = consumo;
            sumaTotal += consumo;
        }

        double promedio = (double) sumaTotal / cantidadSectores;

        int indiceMayor = 0;
        for (int i = 1; i < cantidadSectores; i++) {
            if (sectores[i] > sectores[indiceMayor]) {
                indiceMayor = i;
            }
        }

        int sectoresSobrePromedio = 0;
        int rachaActual = 0;
        int rachaMasLarga = 0;

        for (int i = 0; i < cantidadSectores; i++) {
            if (sectores[i] > promedio) {
                sectoresSobrePromedio++;
                rachaActual++;
                if (rachaActual > rachaMasLarga) {
                    rachaMasLarga = rachaActual;
                }
            } else {
                rachaActual = 0;
            }
        }

        System.out.println();
        System.out.println("Consumo total: " + sumaTotal + " m^3");
        System.out.println("Promedio de consumo: " + promedio);
        System.out.println("Sector con mayor consumo: " + "sector" + " " + (indiceMayor + 1) + " (" + sectores[indiceMayor] + " m^3)");
        System.out.println("Sectores mayor que el promedio: " + sectoresSobrePromedio);
        System.out.println("Racha más larga sobre el promedio: " + rachaMasLarga);
        System.out.println();
        System.out.println("Listado de consumos:");
        for (int i = 0; i < cantidadSectores; i++) {
            System.out.println("Sector " + (i + 1) + ": " + sectores[i] + " m^3");
        }
    }

    }
