import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String args[]){
        String options[]= {"YES", "NO"};
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?","choose one",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        System.out.println(option);
        JOptionPane.showMessageDialog(null,"You 've chosen: "
                    + (option == JOptionPane.YES_NO_OPTION ? "I DO" : "I DON'T"));
    }
}
