package hust.soict.ict.lab01;

import javax.swing.JOptionPane;
public class linearEquation {
    public static void main(String args[]){
        String strA, strB;
        strA = JOptionPane.showInputDialog(null,
                "enter a: ","ax + b = 0",
                JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);

        strB = JOptionPane.showInputDialog(null,
                "enter b: ", "ax + b = 0",
                JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(strB);

        String showInformation = a + "x + " + b + " = 0";

        if(a != 0)
            JOptionPane.showMessageDialog(null,
                    "x = " + -b/a, showInformation,
                    JOptionPane.INFORMATION_MESSAGE);
        else{
            if(b == 0)
                JOptionPane.showMessageDialog(null,
                        "infinite solution",showInformation,
                        JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null,
                        "no solution", showInformation,
                        JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
