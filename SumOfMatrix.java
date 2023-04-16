import java.util.Arrays;
import java.util.Scanner;

public class SumOfMatrix {
    public static Scanner keyboard = new Scanner(System.in);
    static void input(int a[][], int n){
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println("enter row " + i + " column " + j);
                a[i][j] = keyboard.nextInt();
            }
        }
        print(a,n);
    }
    static void print(int a[][], int n){
        for (int i = 0; i < n; i++)
            System.out.println(Arrays.toString(a[i]));
    }

    static void matrixSum(int a[][], int b[][], int n){
        int c[][] = new int[n][n];
        System.out.println("Sum of these matrix: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        print(c,n);
    }
    public static void main(String args[]){
        System.out.println("enter the matrix size: ");
        int n = keyboard.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int [n][n];
        System.out.println("enter the first matrix");
        input(a,n);
        System.out.println("enter the second matrix");
        input(b,n);
        matrixSum(a,b,n);
    }
}
