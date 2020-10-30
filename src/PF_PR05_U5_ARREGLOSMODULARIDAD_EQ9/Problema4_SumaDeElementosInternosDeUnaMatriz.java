package PF_PR05_U5_ARREGLOSMODULARIDAD_EQ9;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class Problema4_SumaDeElementosInternosDeUnaMatriz {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        try {
            int suma = 0;
            int[][] num;
            System.out.println("Ingresa los datos que desee para la matriz");
            int leer = t.nextInt();

            num = new int[leer][leer];
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num.length; j++) {
                    System.out.println("ingresa numero en posicion " + i + " De " + j);
                    num[i][j] = t.nextInt();
                }
            }
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num.length; j++) {
                    System.out.print("  "
                            + num[i][j]);
                }
                System.out.println(" ");
            }

            for (int i = 1; i < leer - 1; i++) {
                for (int j = 1; j < leer - 1; j++) {
                    System.out.println(num[i][j]);
                    suma = suma + num[i][j];
                }
            }
            System.out.println("la suma es " + suma);
        } catch (Exception e) {

        }
    }
}
