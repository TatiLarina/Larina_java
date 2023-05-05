import java.util.InputMismatchException;
import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        try {
            double num = input.nextDouble();
            if (num == 7) {
                System.out.println("Привет");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Пожалуйста, введите число");
        }


    }
}
