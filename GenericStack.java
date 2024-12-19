package pac;
import java.util.Scanner;
public class GenericStack<E> {
    private E[] elements;
    private int size = 0;
    @SuppressWarnings("unchecked")
    public GenericStack(int initialCapacity) {
        elements = (E[]) new Object[initialCapacity];
    }
    public int getSize() {
        return size;
    }
    public E peek() {
        if (size == 0) {
            throw new IllegalStateException("Стек пустой");
        }
        return elements[size - 1];
    }
    public void push(E element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }
    public E pop() {
        if (size == 0) {
            throw new IllegalStateException("Стек пустой");
        }
        E top = elements[--size];
        elements[size] = null;
        return top;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    @SuppressWarnings("unchecked")
    private void resize() {
        E[] newArray = (E[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>(5);

        System.out.println("Введите команды (push <значение>, pop, peek, exit):");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Конец");
                break;
            } else if (input.startsWith("push ")) {
                String value = input.substring(5);
                stack.push(value);
                System.out.println("Добавлено: " + value);
            } else if (input.equalsIgnoreCase("pop")) {
                if (!stack.isEmpty()) {
                    String popped = stack.pop();
                    System.out.println("Удалено: " + popped);
                } else {
                    System.out.println("Стек пустой!");
                }
            } else if (input.equalsIgnoreCase("peek")) {
                if (!stack.isEmpty()) {
                    System.out.println("Верхний элемент: " + stack.peek());
                } else {
                    System.out.println("Пусто");
                }
            } else {
                System.out.println("Неизвестная команда.");
            }

            System.out.println(stack);
        }
        scanner.close();
    }
}