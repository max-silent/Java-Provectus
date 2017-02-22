/**
 * Created by Max on 21.02.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        User user = null;
        String userName = null;
        int userAge = 30;
        try {
            user.getName();
            System.out.println("Message 1");
        } catch (NullPointerException e) {
            userAge = 25;
            System.out.println("Message 2");
        }
        try {
            user = new User(userName, userAge);
            System.out.println("Message 3");
            userAge = 40;
            System.out.println("Message 4");
        } catch (NullPointerException e) {
            userName = "User1";
            System.out.println("Message 5");
            user = new User(userName, userAge);
            System.out.println("Message 6");
        }
    }
}
