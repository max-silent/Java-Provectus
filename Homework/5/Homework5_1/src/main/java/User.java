/**
 * Created by Max on 21.02.2017.
 */
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        if (name.isEmpty()) throw new IllegalArgumentException();
        if (age > 25) throw new IllegalArgumentException();

        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }
}
