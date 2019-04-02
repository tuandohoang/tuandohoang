package Figure1;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean filled;
        ArrayList<GeometricObject> list;
        list = new ArrayList GeometricObject;

        System.out.println("Enter a geometric object, either circle or rectangle: ");
        String geoObject = scanner.toString();

        System.out.println("Enter the color of the object: ");
        String color = scanner.toString();

        System.out.println("Enter the radius of the circle: ");
        int radius = scanner.nextInt();

        System.out.println("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        System.out.println("Enter the height of the rectangle: ");
        int height = scanner.nextInt();

    }
}