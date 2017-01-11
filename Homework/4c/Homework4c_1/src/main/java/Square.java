/**
 * Created by Max on 11.01.2017.
 */
public class Square extends Shape{
    private float square;
    private float perimeter;

    Square(float squareSide){
        super(squareSide);
        square();
        perimeter();
    }
    protected void square(){
        square = measurements[0]* measurements[0];
    }
    protected void perimeter(){
        perimeter = measurements[0]*4;
    }
    public float getSquare() {
        return square;
    }
    public float getPerimeter() {
        return perimeter;
    }
}
