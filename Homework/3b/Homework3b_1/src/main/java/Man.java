/**
 * Created by Max on 13.12.2016.
 */
public class Man {
    private String name;
    private int age;
    private String address;

    Man(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

}
