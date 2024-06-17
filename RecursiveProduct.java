import java.util.Scanner;

public class RecursiveProduct {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        scanner.close();

        int product = calculateProduct(numbers, 0);
        System.out.println("The product of the entered numbers is " + product);
    }
    // Recursive method...
    private static int calculateProduct(int[] numbers, int index) {
        if (index == numbers.length) {
            return 1; 
        } else {
            return numbers[index] * calculateProduct(numbers, index + 1);  
        }
    }
}
