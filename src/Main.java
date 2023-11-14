import java.util.ArrayList;

/**
 * This program draws shapes sorted by area onto a 2D canvas
 *
 * @author
 * @version
 * @since
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        add(shapes);
        display(shapes);
    }

    public static void add(ArrayList<Shape> shapes) {
        shapes.add(new Shape());
        shapes.add(new Rectangle(10.0, 40.0));
//        shapes.add(new Rectangle(20.0, 20.0));
//        shapes.add(new Circle(50.0));
//        shapes.add(new Circle(100.0));
//        shapes.add(new Triangle(3,4,5));
//        shapes.add(new Triangle(7,9,13));
    }

    public static void display(ArrayList<Shape> shapes) {
        for(Shape shape: shapes){
            System.out.println(shape);
        }
    }

}