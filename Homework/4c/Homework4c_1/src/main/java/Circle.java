import static java.lang.Math.pow;

/**
 * Created by Max on 11.01.2017.
 */
public class Circle extends Shape{
    private float square;
    private float perimeter;

    Circle(float circleRound){
        super(circleRound);
        square();
        perimeter();
    }
    public void square(){
        square = (float) (Math.PI*pow(measurements[0],2));
    }
    public void perimeter(){
        perimeter = (float) (2*Math.PI* measurements[0]);
    }
    public float getSquare() {
        return square;
    }
    public float getPerimeter() {
        return perimeter;
    }
}
