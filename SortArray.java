import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = keyboard.nextInt();
        int sum = 0;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("enter value at index [ "+ i + " ]");
            a[i] = keyboard.nextInt();
            sum += a[i];
        }
        System.out.println( "initial array: "+ Arrays.toString(a));
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a[i] < a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println("after sorting: "+ Arrays.toString(a));
        System.out.println("sum: " + sum);
        System.out.println("average: " + (sum/n));
    }

}
