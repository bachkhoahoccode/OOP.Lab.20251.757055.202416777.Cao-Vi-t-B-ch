// This is for exercise 6.1
import javax.swing.UIManager;
import javax.swing.JOptionPane;

public class Choosing_Option {
    public static void main(String[] args) {
        UIManager.put("OptionPane.yesButtonText", "I do");
        UIManager.put("OptionPane.noButtonText", "I don't");
        int option = JOptionPane.showConfirmDialog(null,
        "Do you want to change to the first class ticket?","Confirm",JOptionPane.YES_NO_OPTION
        );
        JOptionPane.showMessageDialog(null,
        "You have chosen: " + (option == JOptionPane.YES_OPTION? "Yes": "No")
        );
        System.exit(0);
    }
}
