package pac;
import java.util.Scanner;
//2 zadanie test
public class TestSecond {
    public static void main(String[] args) {
        newGenericStack<String> stack = new newGenericStack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пять строк:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stack.push(input);
        }
        System.out.println("\nСтроки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        scanner.close();
    }
}