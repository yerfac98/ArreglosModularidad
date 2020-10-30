
package PF_PR05_U5_ARREGLOSMODULARIDAD_EQ9;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class Problema5_ReporteDeVentasParaLaEmpresa_MindsSA {
    
    public static void main(String args[]) {
        Problema5_ReporteDeVentasParaLaEmpresa_MindsSA obj = new Problema5_ReporteDeVentasParaLaEmpresa_MindsSA();
        int ventas[][][] = new int[5][12][3];
        int arreglo[][][] = obj.insertarDatos(ventas);
        System.out.println("=========================================");
        int promedioAños[][] = obj.PromedioDeLosAños(arreglo);
        obj.ImprimirTablaDeAños(promedioAños);
        System.out.println("=========================================");
        int tablameses[][] = obj.InsertarTablaDeMeses(arreglo);
        obj.imprimirMeses(tablameses);
        System.out.println("=========================================");
        int total[] = obj.imprimirTotal(promedioAños);
        System.out.println("El promedio total es: ");
        obj.imprimir_Total(total);
    }

    public int[][][] insertarDatos(int arreglo[][][]) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {/*profundidad*/
            for (int j = 0; j < 5; j++){ /*FILAS*/
                for (int k = 0; k < 12; k++) {/*columnas*/
                    System.out.println("Ingrese la venta del producto: " + (j + 1) + " en el mes: " + (k + 1) + " del año: " + (i + 1) + " ");
                    arreglo[j][k][i] = read.nextInt();
                }

            }
        }
        return arreglo;
    }

    public int[][] PromedioDeLosAños(int Arreglo[][][]) {
        int TablaPorAño[][] = new int[5][3];
        for (int i = 0; i < Arreglo.length; i++) {// controla las filas 

            for (int j = 0; j < Arreglo[0][0].length; j++) {// controla las años
                int sumaPorAño = 0;
                for (int k = 0; k < Arreglo[0].length; k++) {// controla las columnas/los mesess 
                    sumaPorAño = sumaPorAño + Arreglo[i][k][j];
                }
                TablaPorAño[i][j] = sumaPorAño / 12;
            }

        }
        return TablaPorAño;
    }

    public void ImprimirTablaDeAños(int promedioAños[][]) {
        System.out.println("Los promedios por año son:\n");
        System.out.print("                ");
        for (int i = 0; i < promedioAños[0].length; i++) {
            System.out.printf("año " + (i + 1) + "   ");
        }
        System.out.println(" ");
        for (int i = 0; i < promedioAños.length; i++) {
            System.out.printf("producto %2d", i + 1);
            for (int j = 0; j < promedioAños[0].length; j++) {
                System.out.printf("%8d", promedioAños[i][j]);
            }
            System.out.println(" ");
        }
    }

    public int[][] InsertarTablaDeMeses(int Arreglo[][][]) {
        int TablaMensual[][] = new int[5][12];
        for (int i = 0; i < Arreglo.length; i++) {//filas/ productos

            for (int j = 0; j < Arreglo[0].length; j++) {//columnas/ meses
                int suma = 0;
                for (int k = 0; k < Arreglo[0][0].length; k++) {//profundidad/ años
                    suma = suma + Arreglo[i][j][k];
                }
                TablaMensual[i][j] = suma / 3;
            }
        }
        return TablaMensual;
    }

    public void imprimirMeses(int tablameses[][]) {
        System.out.println("los promedios por mes son:\n");
        System.out.print("                 ");
        for (int i = 0; i < tablameses[0].length; i++) {
            //System.out.printf("mes" + (i + 1) + "    ", i);

            switch (i) {
                case 0:
                    //enero
                    System.out.printf("Enero    ",i);
                    break;
                case 1:
                    //febrero

                    System.out.printf("Febrero    ",i);
                    break;
                case 2:
                    //marzo
                    System.out.printf("Marzo    ",i);
                    break;
                case 3:
                    //abril
                    System.out.printf("Abril    ",i);
                    break;
                case 4:
                    //mayo
                    System.out.printf("Mayo    ",i);
                    break;
                case 5:
                    //junio
                    System.out.printf("Junio    ",i);
                    break;
                case 6:
                    //julio
                    System.out.printf("Julio    ",i);
                    break;
                case 7:
                    //agosto
                    System.out.printf("Agosto    ",i);
                    break;
                case 8:
                    //septiembre
                    System.out.printf("Septiembre    ",i);
                    break;
                case 9:
                    //octubre
                    System.out.printf("Octubre    ",i);
                    break;
                case 10:
                    //noviembre
                    System.out.printf("Noviembre    ",i);
                case 11:
                    //diciembre
                    System.out.printf("Diciembre    ",i);
                    break;

            }
        }
        System.out.println(" ");
        for (int i = 0; i < tablameses.length; i++) {
            System.out.printf("producto %2d", i + 1);
            for (int j = 0; j < tablameses[0].length; j++) {
                System.out.printf("%12d", tablameses[i][j]);
            }
            System.out.println("    ");
        }
    }

    public int[] imprimirTotal(int promedioAños[][]) {
        int promedio[] = new int[5];

        for (int i = 0; i < promedioAños.length; i++) {
            int total = 0;
            for (int j = 0; j < promedioAños[0].length; j++) {
                total = total + promedioAños[i][j];
            }
            promedio[i] = total / 3;
        }
        return promedio;
    }

    public void imprimir_Total(int total[]) {
        System.out.printf("%s%8s\n", "producto  ", "promedio total");
        for (int i = 0; i < total.length; i++) {
            System.out.printf("%5d%8d\n", (i + 1), total[i]);
        }
        System.out.println(" ");
    }


}