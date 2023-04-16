import java.util.Scanner;
public class IsoscelesTriangle {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter triangle size: ");
        int size = keyboard.nextInt();
        for (int i = size; i > 0 ; i--){
            for (int j = 0; j < size-(size-i); j++){
                System.out.print(" ");
            }
            for( int k = 0; k < 1 + (size-i)*2;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
