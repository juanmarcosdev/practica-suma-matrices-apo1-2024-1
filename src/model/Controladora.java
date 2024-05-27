package model;

public class Controladora {

    private int[][] matrix1;
    private int[][] matrix2;

    /**
     * Constructor de la clase Controladora para inicializar
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controladora 
     */
    public Controladora() {
        matrix1 = new int[2][2];
        matrix2 = new int[2][2];
    }

    /**
     * Método para establecer la primera matriz.
     *
     * @param matrix La matriz a establecer.
     */
    public void setMatrix1(int[][] matrix) {
        this.matrix1 = matrix;
    }

    /**
     * Método para establecer la segunda matriz.
     *
     * @param matrix La matriz a establecer.
     */
    public void setMatrix2(int[][] matrix) {
        this.matrix2 = matrix;
    }

    /**
     * Método para sumar las dos matrices de 2x2.
     *
     * @return La matriz resultante de la suma de matrix1 y matrix2.
     */
    public int[][] sumarMatrices() {
        int[][] resultado = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultado;
    }
}