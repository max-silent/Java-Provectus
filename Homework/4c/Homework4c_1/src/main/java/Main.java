/**
 * Created by Max on 11.01.2017.
 */
public class Main {
    public static void main(String [] args){
        Square aSquare = new Square(5);
        Circle aCircle = new Circle(10);
        Polygon aPolygon = new Polygon(1f,2f,3f,4f,5f,6f,7f);
        System.out.println("Square perimeter is: "+aSquare.getPerimeter());
        System.out.println("Square area is: "+aSquare.getSquare());
        System.out.println("Circle perimeter is: "+aCircle.getPerimeter());
        System.out.println("Circle area is: "+aCircle.getSquare());
        System.out.println("Polygon perimeter is: "+aPolygon.getPerimeter());

    }
}
