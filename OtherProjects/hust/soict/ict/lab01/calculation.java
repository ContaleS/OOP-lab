package hust.soict.ict.lab01;

import javax.swing.JOptionPane;
public class calculation {
    public static void main(String args[]){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,
                "enter the first number: ", "the first number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,
                "enter the second number: ","the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null,
                num1 +" + " + num2 + " = " + (num1 + num2) + "\n" +
                num1 +" - " + num2 + " = " + (num1 - num2) + "\n" +
                num1 +" * " + num2 + " = " + (num1 * num2) + "\n" +
                num1 +" / " + num2 + " = " + (num1 / num2) + "\n",
                "RESULT",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
