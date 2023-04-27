import java.util.Scanner;

public class Numbers {

    public static void main() {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину числового массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.print("Введите элементы числового массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Элементы массива, кратные 3: ");
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
