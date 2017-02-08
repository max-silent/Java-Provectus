import java.util.Arrays;

/**
 * Created by Max on 08.02.2017.
 */
public class DynamicStack implements Stack, Sortable, Revertable {
    int[] stackArray;
    int headIndex = 0;

    @Override
    public String toString() {
        return "DynamicStack{" +
                "stackArray=" + Arrays.toString(stackArray) +
                '}';
    }

    public DynamicStack(int capacity) {
        stackArray = new int[capacity];
    }

    public void push(int number) {
        if (headIndex >= stackArray.length) expandStack();
        stackArray[headIndex] = number;
        System.out.println("Head Item is " + stackArray[headIndex] + " with index " + headIndex);
        headIndex++;
    }

    public int pop() {
        if (headIndex == 0) {
            System.out.println("All items are popped already");
            return 0;
        }
        headIndex--;
        int poppedItem = stackArray[headIndex];
        stackArray[headIndex] = 0;
        if (headIndex > 0)
            System.out.println("Head Item is " + stackArray[headIndex - 1] + " with index " + (headIndex - 1));
        else
            System.out.println("All items are popped already");

        return poppedItem;
    }

    @Override
    public void sort(SortOrder order) {
        Arrays.sort(stackArray);
        if (order == order.Descending){
            stackArray=invertArray(stackArray);
        }
    }

    private int [] invertArray(int[] stackArray) {
        int[] buf = new int[stackArray.length];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = stackArray[(stackArray.length - 1) - i];
        }
        return buf;
    }

    @Override
    public void revert() {
        stackArray=invertArray(stackArray);
    }

    private void expandStack() {
        stackArray = Arrays.copyOf(stackArray, stackArray.length + 5);
    }
}
