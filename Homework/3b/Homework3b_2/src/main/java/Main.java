/**
 * Created by Max on 13.12.2016.
 */
public class Main {
    public static void main(String[] args){
        Cat cat1 = new Cat("Simon", 3, 7, 3);
        Cat cat2 = new Cat("Tom", 35, 10, 5);
        if (cat1.fight(cat2))
            System.out.println(cat1.getName()+" fight "+cat2.getName());
        if (cat2.fight(cat1))
            System.out.println(cat2.getName()+" fight "+cat1.getName());

    }
}
