/**
 * Created by Max on 18.12.2016.
 */
public class Calculator {
    Value screenValue;
    Operation operation;
    double memoryValue;
    boolean moveScreenValueToMemory;

    Calculator() {
        screenValue = new Value();
        operation = new Operation();
    }

    //Digit is pressed
    void input(int val) {
        if (moveScreenValueToMemory) {
            memoryValue = getScreenValue();
            clearScreenValue();
            moveScreenValueToMemory = false;
        }
        screenValue.input(val);
    }

    //Dot is pressed
    void fraction() {
        screenValue.fraction();
    }

    //Arithmetic operations calling
    void plus() {
        operation.plus(this);
        moveScreenValueToMemory = true;
    }
    void minus() {
        operation.minus(this);
        moveScreenValueToMemory = true;
    }
    void multiply() {
        operation.multiply(this);
        moveScreenValueToMemory = true;
    }
    void division() {
        operation.division(this);
        moveScreenValueToMemory = true;
    }
    void equal() {
        operation.equal(this);
        moveScreenValueToMemory = true;
    }
    void sqrt() {
        operation.sqrt(this);
    }

    //Get, set and reset screen value
    double getScreenValue() {
        return screenValue.getValue();
    }
    void setScreenValue(double val) {
        screenValue.setValue(val);
    }
    void clearScreenValue() {
        screenValue.clear();
    }

}