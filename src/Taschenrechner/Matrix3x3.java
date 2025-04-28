package Taschenrechner;

public class Matrix3x3 extends Matrix{

    public Matrix3x3(double a11, double a12,double a13, double a21, double a22, double a23, double a31, double a32, double a33){
        double [][]matrix1 ={{a11, a12, a13}, {a21, a22, a23}, {a31,a32,a33}};
        matrix = matrix1;
    }

}
