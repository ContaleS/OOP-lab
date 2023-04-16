import java.util.Scanner;
public class linearSystem {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double a11, a12, a21, a22, b1, b2;
        System.out.println("a11*x1 + a12*x2 = b1\na21*x1 + a22*x2 = b2\n");
        System.out.println("enter a1, a2, b1, b2: ");
        a11 = input.nextDouble();
        a12 = input.nextDouble();
        b1 = input.nextDouble();
        a21 = input.nextDouble();
        a22 = input.nextDouble();
        b2 = input.nextDouble();
        double D = a11 * a22 - a12 * a21;
        double Dx = b1 * a22 - b2 * a12;
        double Dy = a11 * b2 - a21 * b1;
        if(D == 0){
            if(Dx != 0 || Dy != 0)
                System.out.println("No solution");
            else
                System.out.println("Infinite solution");
        }
        else
            System.out.println("unique solution: x1 = "+ Dx/D + " x2 = " + Dy/D);

    }
}
