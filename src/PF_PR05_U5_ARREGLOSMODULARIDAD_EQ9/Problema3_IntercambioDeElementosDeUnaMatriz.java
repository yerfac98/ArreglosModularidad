package PF_PR05_U5_ARREGLOSMODULARIDAD_EQ9;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class Problema3_IntercambioDeElementosDeUnaMatriz {

    private Scanner t;
    private int[][] mat;

    public void Inicio() {
        
            t = new Scanner(System.in);
            System.out.println("Defina el tamaño:");
            int filas = t.nextInt();

            mat = new int[filas][filas];
            for (int f = 0; f < mat.length; f++) {
                for (int c = 0; c < mat[f].length; c++) {
                    System.out.println("ingresa numero en posicion " + f + " de " + c);
                    mat[f][c] = t.nextInt();
                    System.out.println("");
                }
            }
            System.out.println("Mostrando resultado");
            System.out.println("-------");

        }
    
    public void imprimir() {
        
        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                System.out.print(mat[f][c] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }

    public void Inversa() {
        System.out.println("Ahora va a la inversa");
        System.out.println("-------");

        for (int c = 0; c < mat.length; c++) {
            for (int f = 0; f < mat.length; f++) {
                System.out.print(mat[f][c] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] ar) {
        Problema3_IntercambioDeElementosDeUnaMatriz ma = new Problema3_IntercambioDeElementosDeUnaMatriz();
        ma.Inicio();
        ma.imprimir();
        ma.Inversa();
    }
}
