/**
 * Created by Max on 13.12.2016.
 */
public class Main {
    public static void main(String[] args){
        Man man1 = new Man("John", 21, "USA");
        Man man2 = new Man("Dave", 32, "Holland");
        Woman woman1 = new Woman("Jessica", 23, "USA");
        Woman woman2 = new Woman("Lilith", 730, "Nowhere");
        System.out.println("Man 1:");
        System.out.println(man1.getName()+" "+man1.getAge()+" "+man1.getAddress());
        System.out.println("Man 2:");
        System.out.println(man2.getName()+" "+man2.getAge()+" "+man2.getAddress());
        System.out.println("Woman 1:");
        System.out.println(woman1.getName()+" "+woman1.getAge()+" "+woman1.getAddress());
        System.out.println("Woman 2:");
        System.out.println(woman2.getName()+" "+woman2.getAge()+" "+woman2.getAddress());
    }
}
