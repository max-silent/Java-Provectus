/**
 * Created by Max on 07.02.2017.
 */
public interface TransferMoneyListener {
    boolean transferMoney(Card fromCard, Card toCard, long amount);
}
