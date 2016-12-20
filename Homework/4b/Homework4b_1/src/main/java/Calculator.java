/**
 * Created by Max on 19.12.2016.
 */
public class Calculator {
    Value screenValue;
    Value memoryValue;
    Operation operation;
    boolean moveScreenValueToMemory;

    Calculator() {
        screenValue = new Value();
        memoryValue = new Value();
        operation = new Operation();
    }

    //Digit is pressed
    void input(int val) {
        if (moveScreenValueToMemory) {
            memoryValue.setValue(screenValue.getValue());
            screenValue.clear();
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
        operation.plus(memoryValue, screenValue, moveScreenValueToMemory);
        moveScreenValueToMemory = true;
    }
    void minus() {
        operation.minus(memoryValue, screenValue, moveScreenValueToMemory);
        moveScreenValueToMemory = true;
    }
    void multiply() {
        operation.multiply(memoryValue, screenValue, moveScreenValueToMemory);
        moveScreenValueToMemory = true;
    }
    void division() {
        operation.division(memoryValue, screenValue, moveScreenValueToMemory);
        moveScreenValueToMemory = true;
    }
    void equal() {
        operation.equal(memoryValue, screenValue, moveScreenValueToMemory);
        moveScreenValueToMemory = true;
    }
    void sqrt() {
        operation.sqrt(memoryValue, screenValue, moveScreenValueToMemory);
    }


}
