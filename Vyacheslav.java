import java.util.Scanner;

public class Vyacheslav {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = input.nextLine();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }

    }
}
