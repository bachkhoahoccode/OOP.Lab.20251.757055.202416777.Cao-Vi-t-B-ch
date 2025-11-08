import java.util.Arrays;
public class NumericArrays {
    public static void main(String[] args) {
        int[] numbers = {1789, 2035, 1899, 1456, 2013};
        double sum = 0;
        for (int num : numbers) sum += num;
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / numbers.length);
    } 
}
