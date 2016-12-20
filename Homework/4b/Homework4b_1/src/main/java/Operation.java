/**
 * Created by Max on 19.12.2016.
 */
public class Operation {
    int operation;
    final int OPERATION_NONE = -1;
    final int OPERATION_PLUS = 0;
    final int OPERATION_MINUS = 1;
    final int OPERATION_MULTIPLY = 2;
    final int OPERATION_DIVISION = 3;
    final int OPERATION_EQUAL = 4;
    //final int OPERATION_SQRT = 5;

    Operation (){
        operation=OPERATION_NONE;
    }

    //Arithmetic operations implementing
    void plus(Value memoryValue, Value screenValue, boolean moveScreenValueToMemory) {
        executePreviousOperation(memoryValue, screenValue, moveScreenValueToMemory);
        operation = OPERATION_PLUS;
    }
    void minus(Value memoryValue, Value screenValue, boolean moveScreenValueToMemory) {
        executePreviousOperation(memoryValue, screenValue, moveScreenValueToMemory);
        operation = OPERATION_MINUS;
    }
    void multiply(Value memoryValue, Value screenValue, boolean moveScreenValueToMemory) {
        executePreviousOperation(memoryValue, screenValue, moveScreenValueToMemory);
        operation = OPERATION_MULTIPLY;
    }
    void division(Value memoryValue, Value screenValue, boolean moveScreenValueToMemory) {
        executePreviousOperation(memoryValue, screenValue, moveScreenValueToMemory);
        operation = OPERATION_DIVISION;
    }
    void equal(Value memoryValue, Value screenValue, boolean moveScreenValueToMemory){
        executePreviousOperation(memoryValue, screenValue, moveScreenValueToMemory);
        operation=OPERATION_EQUAL;
    }
    void sqrt(Value memoryValue, Value screenValue, boolean moveScreenValueToMemory){
        if (moveScreenValueToMemory) {
            memoryValue.setValue(screenValue.getValue());
            screenValue.clear();
        }
        screenValue.setValue(Math.sqrt(screenValue.getValue()));
        //operation=OPERATION_SQRT;
    }

    //Execute previous operation (last pressed operation button)
    void executePreviousOperation(Value memoryValue, Value screenValue, boolean moveScreenValueToMemory) {
        if (moveScreenValueToMemory) return;    //Return, if previous pressed button was operation button
        switch (operation) {
            case OPERATION_PLUS:
                screenValue.setValue(memoryValue.getValue() + screenValue.getValue());
                break;
            case OPERATION_MINUS:
                screenValue.setValue(memoryValue.getValue() - screenValue.getValue());
                break;
            case OPERATION_MULTIPLY:
                screenValue.setValue(memoryValue.getValue() * screenValue.getValue());
                break;
            case OPERATION_DIVISION:
                screenValue.setValue(memoryValue.getValue() / screenValue.getValue());
                break;
        }
    }
}
