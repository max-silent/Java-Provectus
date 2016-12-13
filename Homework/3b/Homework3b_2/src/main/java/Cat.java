import static java.lang.Math.abs;

/**
 * Created by Max on 13.12.2016.
 */
public class Cat {


    private String name;
    private int age;
    private int weight;
    private int strength;

    Cat(String name, int age, int weight, int strength){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public int getStrength() {
        return strength;
    }
    public boolean fight(Cat anotherCat){
        return (weight * strength - abs(3 - age)) > (anotherCat.getWeight() * anotherCat.getStrength() - abs(3 - anotherCat.getAge()));
    }
}
