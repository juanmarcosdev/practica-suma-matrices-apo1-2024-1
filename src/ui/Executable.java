package ui;

import java.util.Scanner;
import model.Controladora;

public class Executable {

    // Atributos de la clase Ejecutable
    private Scanner reader;
    private Controladora cont;
    private static boolean flag;

    private Executable() {
        reader = new Scanner(System.in);
        cont = new Controladora();
    }

    public void run(boolean flag) {

        flag = false;

        while (!flag) {

            System.out.println("\n\nBienvenido al menu:\n");
            System.out.println("Opciones:\n" + "1. Primera opcion \n" + "2. Segunda opcion \n"
                    + "3. Sumar dos matrices 2x2 \n" + "4. Salir del programa \n");

            int option = reader.nextInt();
            reader.nextLine();

            switch (option) {
                case 1:
                    primeraOpcion();
                    break;
                case 2:
                    segundaOpcion();
                    break;
                case 3:
                    capturarMatrices();
                    break;
                case 4:
                    flag = true;
                    System.exit(0);
                    break;
                default:
                    System.out.print("Por favor ingrese una opcion valida");
                    continue;
            }

        }

    }

    private void capturarMatrices() {
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        System.out.println("Ingrese los elementos de la primera matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrix1[i][j] = reader.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrix2[i][j] = reader.nextInt();
            }
        }

        cont.setMatrix1(matrix1);
        cont.setMatrix2(matrix2);

        int[][] resultado = cont.sumarMatrices();

        System.out.println("La matriz resultante de la suma es:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Executable mainApp = new Executable();
        mainApp.run(flag);
    }

    private void primeraOpcion() {
        // Implementación de la primera opción
    }

    private void segundaOpcion() {
        // Implementación de la segunda opción
    }
}