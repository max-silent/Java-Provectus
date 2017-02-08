import java.util.Random;

/**
 * Created by Max on 06.02.2017.
 */
public class Card {
    private User owner;
    private Bill bill;

    private long cardNumber;

    public Card(User owner, Bill bill) {
        this.owner = owner;
        this.bill = bill;

        Random random = new Random();
        cardNumber = random.nextLong();
    }

    public User getOwner() {
        return owner;
    }

    public Bill getBill() {
        return bill;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "Card{" +
                "owner=" + owner +
                ", bill=" + bill +
                ", cardNumber=" + cardNumber +
                '}';
    }
}
