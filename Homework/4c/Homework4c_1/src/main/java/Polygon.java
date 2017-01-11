import static java.lang.Math.pow;

/**
 * Created by Max on 11.01.2017.
 */
public class Polygon extends Shape{
    // Square of polygon cannot be calculated
    //private float square;
    private float perimeter;

    Polygon(float ... polygonSide){
        super(polygonSide);
        perimeter();
    }
    public void perimeter(){
        perimeter = 0;
        for(float side:measurements){
            perimeter += side;
        }
    }
    public float getPerimeter() {
        return perimeter;
    }
}
