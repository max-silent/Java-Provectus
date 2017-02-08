/**
 * Created by Max on 08.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        DynamicStack aStack = new DynamicStack(2);
        aStack.push(5);
        aStack.push(2);
        aStack.push(3);
        aStack.push(4);
        aStack.push(10);
        aStack.pop();
        aStack.push(5);
        aStack.pop();
        //aStack.pop();
        //aStack.pop();
        //aStack.pop();
        //aStack.pop();
        //aStack.pop();
        System.out.println(aStack);
        aStack.sort(SortOrder.Ascending);
        System.out.println(aStack);
        aStack.sort(SortOrder.Descending);
        System.out.println(aStack);
        aStack.revert();
        System.out.println(aStack);
        aStack.revert();
        System.out.println(aStack);
    }
}
