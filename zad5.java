package pac;
public class zad5 {
    public static Circle findLargest(Circle[] circles) {
        if (circles == null || circles.length == 0) {
            throw new IllegalArgumentException("пусто");
        }
        Circle largest = circles[0];
        for (Circle circle : circles) {
            if (circle.compareTo(largest) > 0) {
                largest = circle;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(5.0),
                new Circle(7.5),
                new Circle(3.2),
                new Circle(10.0),
                new Circle(6.8)
        };
        Circle largestCircle = findLargest(circles);
        System.out.println("Наибольшая окружность: " + largestCircle);
    }
}