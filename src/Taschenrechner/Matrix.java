package Taschenrechner;

import java.util.Arrays;

public abstract class Matrix {
    protected double[][] matrix;


    @Override
    public String toString() {
    String ausgabe="";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
            ausgabe+=matrix[i][j]+"\t";
            }
            ausgabe+="\n";
        }

        return ausgabe;
    }


}
