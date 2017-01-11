/**
 * Created by Max on 11.01.2017.
 */
public abstract class Shape {
    Shape(float ... shapeParameters){
        measurements = shapeParameters;
    }
    protected abstract void perimeter();
    protected float [] measurements;
}
