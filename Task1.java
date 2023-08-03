
/*
 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
 вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float index = 0;
        while (true) {
            try {
                System.out.println("Введите дробное число типа float: ");
                index = Float.parseFloat(scanner.nextLine());
                System.out.println(index);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Введено не дробное число типа float");
            }
        }
    }
}
