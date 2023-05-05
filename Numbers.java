import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Введите числовой массив через пробелы: ");
            String[] array = input.nextLine().split(" ");
            double[] arrayNumbers = new double[array.length];

            for (int i = 0; i < array.length; i++) {
                arrayNumbers[i] = Double.parseDouble(array[i]);
            }

            System.out.print("Элементы массива, кратные 3: ");
            for (Double number : arrayNumbers) {
                if (number % 3 == 0) {
                    String s = String.format("%.0f", number);
                    System.out.print(s + " ");
                }
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Пожалуйста, введите числовой массив через пробелы");
        }


    }
}
