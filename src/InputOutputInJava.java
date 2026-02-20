import java.util.Scanner;

public class InputOutputInJava {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        String num = input.nextLine();
        System.out.println(num);
        input.close();
    }
}
