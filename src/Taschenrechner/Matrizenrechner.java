package Taschenrechner;

public class Matrizenrechner {

    public static Matrix2x2 MatrixAddition(Matrix2x2 a, Matrix2x2 b){
        double a11,a12,a21,a22;
        a11=a.matrix[0][0]+b.matrix[0][0];
        a12=a.matrix[0][1]+b.matrix[0][1];
        a21=a.matrix[1][0]+b.matrix[1][0];
        a22=a.matrix[1][1]+b.matrix[1][1];
         return new Matrix2x2(a11,a12,a21,a22);
    }

    public static Matrix3x3 MatrixAddition(Matrix3x3 a, Matrix3x3 b){
        double a11,a12,a13,a21,a22,a23,a31,a32,a33;
        a11=a.matrix[0][0]+b.matrix[0][0];
        a12=a.matrix[0][1]+b.matrix[0][1];
        a13=a.matrix[0][2]+b.matrix[0][2];
        a21=a.matrix[1][0]+b.matrix[1][0];
        a22=a.matrix[1][1]+b.matrix[1][1];
        a23=a.matrix[1][2]+b.matrix[1][2];
        a31=a.matrix[2][0]+b.matrix[2][0];
        a32=a.matrix[2][1]+b.matrix[2][1];
        a33=a.matrix[2][2]+b.matrix[2][2];
        return new Matrix3x3(a11,a12,a13,a21,a22,a23,a31,a32,a33);
    }

    public static Matrix2x2 MatrixMultiplikation(Matrix2x2 a, Matrix2x2 b){
        double a11,a12,a21,a22;
        a11=a.matrix[0][0]*b.matrix[0][0]+a.matrix[0][1]*b.matrix[1][0];
        a12=a.matrix[0][0]*b.matrix[0][1]+a.matrix[0][1]*b.matrix[1][1];
        a21=a.matrix[1][0]*b.matrix[0][0]+a.matrix[1][1]*b.matrix[1][0];
        a22=a.matrix[1][0]*b.matrix[0][1]+a.matrix[1][1]*b.matrix[1][1];
        return new Matrix2x2(a11,a12,a21,a22);
    }

    public static Matrix3x3 MatrixMultiplikation(Matrix3x3 a, Matrix3x3 b){
        double a11,a12,a13,a21,a22,a23,a31,a32,a33;
        a11=a.matrix[0][0]*b.matrix[0][0]+a.matrix[0][1]*b.matrix[1][0]+a.matrix[0][2]*b.matrix[2][0];
        a12=a.matrix[0][0]*b.matrix[0][1]+a.matrix[0][1]*b.matrix[1][1]+a.matrix[0][2]*b.matrix[2][1];
        a13=a.matrix[0][0]*b.matrix[0][2]+a.matrix[0][1]*b.matrix[1][2]+a.matrix[0][2]*b.matrix[2][2];
        a21=a.matrix[1][0]*b.matrix[0][0]+a.matrix[1][1]*b.matrix[1][0]+a.matrix[1][2]*b.matrix[2][0];
        a22=a.matrix[1][0]*b.matrix[0][1]+a.matrix[1][1]*b.matrix[1][1]+a.matrix[1][2]*b.matrix[2][1];
        a23=a.matrix[1][0]*b.matrix[0][2]+a.matrix[1][1]*b.matrix[1][2]+a.matrix[1][2]*b.matrix[2][2];
        a31=a.matrix[2][0]*b.matrix[0][0]+a.matrix[2][1]*b.matrix[1][0]+a.matrix[2][2]*b.matrix[2][0];
        a32=a.matrix[2][0]*b.matrix[0][1]+a.matrix[2][1]*b.matrix[1][1]+a.matrix[2][2]*b.matrix[2][1];
        a33=a.matrix[2][0]*b.matrix[0][2]+a.matrix[2][1]*b.matrix[1][2]+a.matrix[2][2]*b.matrix[2][2];
        return new Matrix3x3(a11,a12,a13,a21,a22,a23,a31,a32,a33);
    }
}
