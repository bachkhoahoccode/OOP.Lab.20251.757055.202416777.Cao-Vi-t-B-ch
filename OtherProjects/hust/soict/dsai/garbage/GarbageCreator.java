import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path; 
import java.util.Scanner; 

public class GarbageCreator {
    public static void main(String[] args) throws IOException{
        String filename = "hust/soict/dsai/garbage/garbage.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Path.of(filename));
        startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Using String\n2. Using StringBuilder\nChoose: ");
        int choice = scanner.nextInt();
        scanner.close();
        //integrated nogarbage code here already, cuz that seems more convenient
        switch(choice){
            case 1:
                String outputString = "";
                for (byte b: inputBytes) outputString += (char) b;
            case 2:
                StringBuilder outputStringBuilder = new StringBuilder();
                for (byte b: inputBytes) outputStringBuilder.append((char) b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
