
/*
 4. Разработайте программу, которая выбросит Exception, 
 когда пользователь вводит пустую строку. 
 Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные: ");
        isEmpty(scanner.nextLine());
    }

    private static void isEmpty(String string) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (string.isEmpty()) {
                System.out.println("Нельзя вводить пустые строки");
                System.out.printf("Введите данные: ");
                string = scanner.nextLine();
            } else {
                break;
            }
        }
    }
}
