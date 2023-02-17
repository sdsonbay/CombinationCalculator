import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n, r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        n = scanner.nextInt();
        System.out.println("Enter the second number: ");
        r = scanner.nextInt();

        int result = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println(result);

    }

    public static int factorial(int number){
        int result = 1;

        for(int i = 1; i <= number; i++){
            result *= i;
        }

        return result;
    }
}
