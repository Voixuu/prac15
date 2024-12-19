package pac;
import java.util.ArrayList;
public class newGenericStack<E> extends ArrayList<E> {
    public void push(E element) {
        this.add(element);
    }
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return this.remove(size() - 1);
    }
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return this.get(size() - 1);
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public int getSize() {
        return size();
    }
    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}