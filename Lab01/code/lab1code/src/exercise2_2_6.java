import javax.swing.JOptionPane;
public class exercise2_2_6 {
    public static void main(String[] args) {
        String[] options = {
            "Giải phương trình bậc nhất (ax + b = 0)",
            "Giải hệ phương trình bậc nhất 2 ẩn",
            "Giải phương trình bậc hai (ax^2 + bx + c = 0)",
            "Exit"
        };
        while (true) {
            int choice = JOptionPane.showOptionDialog(null,
                "Chọn loại phương trình:",
                "Trình giải phương trình",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
            );
            switch(choice) {
                case -1:
                    System.exit(0);
                case 0: solveLinearEquation();
                    break;
                case 1: solveLinearSystem();
                    break;
                case 2: solveQuadraticEquation();
                    break;
                case 3: // Exit
                    JOptionPane.showMessageDialog(null, "Thoát chương trình.");
                    System.exit(0);
            }
                
        }
    }

    // get valid double input
    private static double getInput(String heso) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Nhập hệ số " + heso + ":");
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Bái bai!");
                System.exit(0);
            }
            try {
                return Double.parseDouble(input.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    // Solve ax + b = 0
    private static void solveLinearEquation() {
        double a;
        while (true) {
            a = getInput("a (a ≠ 0)");
            if (a != 0) break;
            JOptionPane.showMessageDialog(null, "Hệ số phải khác 0.");
        }
        double b = getInput("b");
        double x = -b / a;
        JOptionPane.showMessageDialog(null, String.format("Nghiệm: x = %.4f", x));
    }

    // Solve system:
    // a11*x1 + a12*x2 = b1
    // a21*x1 + a22*x2 = b2
    private static void solveLinearSystem() {
        double a11 = getInput("a11");
        double a12 = getInput("a12");
        double b1 = getInput("b1");
        double a21 = getInput("a21");
        double a22 = getInput("a22");
        double b2 = getInput("b2");

        double D = a11 * a22 - a12 * a21;
        double Dx = b1 * a22 - b2 * a12;
        double Dy = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = Dx / D;
            double x2 = Dy / D;
            JOptionPane.showMessageDialog(null, String.format(
                "Nghiệm duy nhất:\nx1 = %.4f\nx2 = %.4f", x1, x2));
        } else {
            if (Dx == 0 && Dy == 0) {
                JOptionPane.showMessageDialog(null, "Hệ phương trình vô số nghiệm.");
            } else {
                JOptionPane.showMessageDialog(null, "Hệ phương trình vô nghiệm.");
            }
        }
    }

    // Solve ax^2 + bx + c = 0
    private static void solveQuadraticEquation() {
        double a;
        while (true) {
            a = getInput("a (a ≠ 0)");
            if (a != 0) break;
            JOptionPane.showMessageDialog(null, "Hệ số phải khác 0.");
        }
        double b = getInput("b");
        double c = getInput("c");

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, String.format(
                "Hai nghiệm phân biệt:\nx1 = %.4f\nx2 = %.4f", x1, x2));
        } else if (delta == 0) {
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, String.format(
                "Nghiệm kép:\nx = %.4f", x));
        } else {
            JOptionPane.showMessageDialog(null, "Không có nghiệm thực.");
        }
    }
}