package hust.soict.ict.lab01;

import java.util.Scanner;
import java.lang.Math;
public class secondDegreeEquation {
    public static void linearEquation(double a, double b){
        if( a == 0){
            if( b == 0)
                System.out.println("infinite solution");
            else
                System.out.println("no solution");
        }
        else
            System.out.println("unique solution: x = " + -b/a);
    }
    public static void main(String args[]) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0\nenter a b c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        if (a == 0)
            linearEquation(b, c);
        else {
            double delta = b*b - 4*a*c;
            if(delta > 0 )
                System.out.println("two roots: x1 = " + (-b- Math.sqrt(delta)) / (2*a) +
                        " x2 = " + (-b + Math.sqrt(delta)) / (2*a));
            else if (delta == 0) {
                System.out.println("double root x1 = x2 =  " + -b / (2*a));
            }
            else
                System.out.println("No solution");
        }
    }
}
