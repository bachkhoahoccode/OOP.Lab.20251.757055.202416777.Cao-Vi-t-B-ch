import javax.swing.JOptionPane;
import javax.swing.UIManager;
public class exercise2_2_5{
    public static void main(String[] args) {
        UIManager.put("OptionPane.isAlwaysOnTop", true);
        JOptionPane.showMessageDialog(null,
         "Chương trình hiển thị tổng, hiệu, tích, thương của 2 số thực",
         "Chào",
          JOptionPane.INFORMATION_MESSAGE
          );
        double[] input = new double[2];
        input[0] = getInput("nhất");
        input[1] = getInput("hai");
        String result = calculateInput(input[0], input[1]);
        JOptionPane.showMessageDialog(null, result,
         "Kết quả", JOptionPane.INFORMATION_MESSAGE);
    }
    public static double getInput(String order){   
        double num = 0.0;
        while(true){
            String strNum = JOptionPane.showInputDialog(null,
            "Nhập số thực thứ " + order +" :");
            try {
                num = Double.parseDouble(strNum);
                if (order.equals("hai") && num == 0.0) {
                    int response = JOptionPane.showConfirmDialog(null,
                 "Mẫu số hiện bằng 0, vẫn tiếp tục?",
                  "Xác nhận",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (response == JOptionPane.NO_OPTION)
                     continue;
                }
                break;
            }             
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                 "Giá trị nhập vào không hợp lệ. Vui lòng nhập lại.",
                  "Lỗi", JOptionPane.ERROR_MESSAGE);
            }   
        }
        return num;
    }
    
    private static String calculateInput(double num1, double num2){
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String quotient;
        if (num2 != 0) quotient = String.valueOf(num1 / num2);
        else  quotient= "Không xác định (chia cho 0)\n";
        return "Tổng: " + sum + "\n" +
                "Hiệu: " + difference + "\n" +
                "Tích: " + product + "\n"+
                "Thương: " + quotient + "\n";
    }
}
    