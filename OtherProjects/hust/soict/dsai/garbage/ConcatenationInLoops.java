import java.util.Random;
public class ConcatenationInLoops {
    public static void main(String[] args) {
        // Using String concatenation in a loop (inefficient)
        Random r = new Random(123);
        long Start = System.currentTimeMillis();
        String S = "";
        for (int i = 0; i < 65536; i++) {
            S = S + r.nextInt(2);
        }
        System.out.println((System.currentTimeMillis() - Start));

        // Using StringBuilder in a loop (efficient)
        r = new Random(123);
        Start = System.currentTimeMillis();
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            SB.append(r.nextInt(2));
        }
        System.out.println((System.currentTimeMillis() - Start));
    }
}
