package Secao_8_1.application3_comOrientacaoObjeto.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;

        return Math.sqrt(
                p * (p - a) * (p - b) * (p - c)
        );
    }

    public static Triangle largerTriangle(Triangle t1, Triangle t2) {
        return t1.area() > t2.area() ? t1 : t2;
    }
}
