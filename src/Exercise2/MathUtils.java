package Exercise2;

import java.util.Scanner;

public class MathUtils {

    static final double PI=3.1415;

    public static void calculateSurfaceArea(double radius){
        double S;
        S=4*PI*(radius*radius);

        System.out.println("Surface area is: "+S);
    }
    public static void calculateEquatorLength(double radius){
        double C;
        C=2*PI*radius;

        System.out.println("Equator length is: "+C);
    }
}
