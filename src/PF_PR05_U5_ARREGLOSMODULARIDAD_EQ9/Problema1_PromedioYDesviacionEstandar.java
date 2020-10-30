package PF_PR05_U5_ARREGLOSMODULARIDAD_EQ9;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class Problema1_PromedioYDesviacionEstandar {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int sumatoria = 0, N;
        double media = 0, var = 0.0, desviacion = 0.0;

        System.out.println("Ingrese la cantidad de datos para calcular la media y la desviacion estandar");
        N = t.nextInt();
        int valor[] = new int[N];

        for (int i = 0; i < N; i++) {

            System.out.println("Ingrese el valor " + (i + 1) + ":");
            valor[i] = t.nextInt();
            sumatoria = sumatoria + valor[i];
        }

        media = sumatoria / N;
        for (int i = 0; i < N; i++) {
            double rango;
            rango = Math.pow(valor[i] - media, 2);
            var = var + rango;
        }
        var = var / N;
        desviacion = Math.sqrt(var);
        System.out.println("Media: " + media);
        System.out.println("Desvianción Estándar: " + desviacion);
    }
}
