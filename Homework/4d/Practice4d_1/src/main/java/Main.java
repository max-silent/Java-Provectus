/**
 * Created by Max on 06.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        User user = bank.registration("Alex");
        Card card1 = bank.createCard(user);
        Card card2 = bank.createCard(user);
        bank.addTransferMoneyListener(user, new TransferMoneyListener() {
            @Override
            public boolean transferMoney(Card fromCard, Card toCard, long amount) {
                if (amount > 1000) return false;

                return true;
            }
        });

/*
            bank.addGetMoneyListener(user, new GetMoneyListener() {
            @Override
            public boolean getMoney(Card card, long amount) {
                if (amount > 1000) return false;

                return true;
            }
        });
*/
        bank.addMoney(card1, 3500);
        bank.getMoney(card1, 1500);
        System.out.println(card1);
        System.out.println(card2);
        bank.transfer(card1, card2, 1500);
        System.out.println(card1);
        System.out.println(card2);

        System.out.println();
        System.out.println(bank);


        //System.out.println(card1);
        //System.out.println(card2);
        //bank.transfer(card1, card2, 500);
        //System.out.println(card1);
        //System.out.println(card2);
        //bank.getMoney(card1, 1500);

        //bank.getMoney(card1, 100);
        //System.out.println(card1);
        //bank.getMoney(card1, 1000);
        //System.out.println(card1);

        //System.out.println(card1);
        //System.out.println(bank);
    }
}
