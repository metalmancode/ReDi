
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide the first number: ");
        int first = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(first +"x"+ i+ "="+(first*i) );

        }
    }
}


