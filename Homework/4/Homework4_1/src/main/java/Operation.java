/**
 * Created by Max on 18.12.2016.
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
    void plus(Calculator  calculator) {
        executePreviousOperation(calculator);
        operation = OPERATION_PLUS;
    }
    void minus(Calculator  calculator) {
        executePreviousOperation(calculator);
        operation = OPERATION_MINUS;
    }
    void multiply(Calculator  calculator) {
        executePreviousOperation(calculator);
        operation = OPERATION_MULTIPLY;
    }
    void division(Calculator  calculator) {
        executePreviousOperation(calculator);
        operation = OPERATION_DIVISION;
    }
    void equal(Calculator  calculator){
        executePreviousOperation(calculator);
        operation=OPERATION_EQUAL;
    }
    void sqrt(Calculator  calculator){
        if (calculator.moveScreenValueToMemory) {
            calculator.memoryValue = calculator.getScreenValue();
            calculator.clearScreenValue();
        }
        calculator.setScreenValue(Math.sqrt(calculator.getScreenValue()));
        //operation=OPERATION_SQRT;
    }

    //Execute previous operation (last pressed operation button)
    void executePreviousOperation(Calculator  calculator) {
        if (calculator.moveScreenValueToMemory) return;    //Return, if previous pressed button was operation button
        switch (operation) {
            case OPERATION_PLUS:
                calculator.setScreenValue(calculator.memoryValue + calculator.getScreenValue());
                break;
            case OPERATION_MINUS:
                calculator.setScreenValue(calculator.memoryValue - calculator.getScreenValue());
                break;
            case OPERATION_MULTIPLY:
                calculator.setScreenValue(calculator.memoryValue * calculator.getScreenValue());
                break;
            case OPERATION_DIVISION:
                calculator.setScreenValue(calculator.memoryValue / calculator.getScreenValue());
                break;
        }
    }
}
