import java.util.Arrays;


/**
 * Created by Max on 06.02.2017.
 */
public class Bank {
    private User[] users;

    public Bank() {
        users = new User[0];
    }

    public User registration(String name) {
        User user = new User(name);
        //Arrays.copyOf(users, users.length+1);
        User[] buf = users;
        users = new User[users.length + 1];
        for (int i = 0; i < buf.length; i++) {
            users[i] = buf[i];
        }
        users[users.length - 1] = user;
        return user;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "users=" + Arrays.toString(users) +
                '}';
    }

    public Card createCard(User user) {
        Bill bill = new Bill();
        Card card = new Card(user, bill);

        return card;
    }

    public boolean transfer(Card fromCard, Card toCard, long amount) {
        TransferMoneyListener listener = fromCard.getOwner().getListenerForTransfer();
        if (listener!=null){
            boolean allowTransferMoneyOperation = listener.transferMoney(fromCard, toCard, amount);
            if (!allowTransferMoneyOperation){
                System.out.println("Пользователь запретил переводить деньги между картами");
                return false;
            }
        }
        if (fromCard == toCard) {
            System.out.println("Вы не можете перевести деньги между одинаковыми картами");
            return false;
        }
        if (!getMoney(fromCard, amount)) return false;
        addMoney(toCard, amount);
        return true;
    }

    public void addMoney(Card card, long amount) {
        card.getBill().addAmount(amount);
    }

    public boolean getMoney(Card card, long amount) {
        GetMoneyListener listener = card.getOwner().getListenerForGet();
        if (listener!=null){
            boolean allowGetMoneyOperation = listener.getMoney(card, amount);
            if (!allowGetMoneyOperation){
                System.out.println("Пользователь запретил снимать деньги с карты");
                return false;
            }
        }
        if (card.getBill().getAmount() < amount) {
            System.out.println("Недостаточно денег на счету");
            return false;
        }
        card.getBill().addAmount(-amount);
        return true;
    }

    public void addGetMoneyListener(User user, GetMoneyListener listener) {
        user.setListenerForGet(listener);
    }
    public void addTransferMoneyListener(User user, TransferMoneyListener listener) {
        user.setListenerForTransfer(listener);
    }
}
