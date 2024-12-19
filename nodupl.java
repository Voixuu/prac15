package pac;
import java.util.ArrayList;
//zad3
public class nodupl {
    public static <E> ArrayList<E> nodupl(ArrayList<E> list) {
        ArrayList<E> uniqueList = new ArrayList<>();
        for (E element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        return uniqueList;
    }
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Яблоко");
        originalList.add("Кокосик");
        originalList.add("Банан");
        originalList.add("Кокосик");
        originalList.add("Кокосик");
        originalList.add("текст");
        System.out.println("Оригинальный список: " + originalList);
        ArrayList<String> uniqueList = nodupl(originalList);
        System.out.println("Список без дубликатов: " + uniqueList);
    }
}