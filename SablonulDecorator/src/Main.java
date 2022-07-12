public class Main {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Aria este " + rectangle.area());
        RectangleDecoration rd = new RectangleDecoration(rectangle);
        System.out.println("Volumul este " + rd.perimeter());
    }
}
