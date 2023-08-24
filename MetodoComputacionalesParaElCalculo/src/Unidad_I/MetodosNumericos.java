/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_I;

import java.util.Scanner;

/**
 *
 * @author galin
 */
public class MetodosNumericos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, f, rta, total, h;
        int puntos;
        System.out.println("Ingrese cantidad de puntos");
        puntos = sc.nextInt();
        double[][] tabla;
        tabla = new double[2][puntos];
        //carga tabla
        if (puntos % 2 != 0) {
            for (int i = 0; i < tabla[0].length; i++) {
                System.out.println("Ingrese x");
                x = sc.nextDouble();
                System.out.println("Ingrese f(x)");
                f = sc.nextDouble();
                tabla[0][i] = x;
                tabla[1][i] = f;
            }
            System.out.println("Ingrese h");
            h = sc.nextDouble();
            total = simpson(tabla, h);

            System.out.println("El resultado de Simpson es:" + total);
        }

    }

    public static double simpson(double[][] tabla, double h) {
        double aprox = 0, sumaImpar = 0, sumaPar = 0, total = 0;

        aprox = tabla[1][0] + tabla[1][tabla[0].length - 1];
        System.out.println(tabla[1][tabla[0].length - 1]);
        System.out.println(tabla[1][0]);
        System.out.println(aprox);
        for (int i = 1; i < tabla[0].length - 1; i = i + 2) {
            sumaImpar = sumaImpar + tabla[1][i];
        }
        System.out.println(sumaImpar);
        sumaImpar = sumaImpar * 4;
        System.out.println(sumaImpar);
        for (int j = 2; j < tabla[0].length - 2; j = j + 2) {
            sumaPar = sumaPar + tabla[1][j];
        }
        System.out.println(sumaPar);
        sumaPar = sumaPar * 2;
        System.out.println(sumaPar);
        System.out.println(h/3);
        total = (aprox + sumaImpar + sumaPar) * (h / 3);
        return total;

    }
}
