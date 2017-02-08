/**
 * Created by Max on 06.02.2017.
 */
public class User {
    private String name;

    private GetMoneyListener listenerForGet;
    private TransferMoneyListener listenerForTransfer;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public GetMoneyListener getListenerForGet() {
        return listenerForGet;
    }

    public void setListenerForGet(GetMoneyListener listenerForGet) {
        this.listenerForGet = listenerForGet;
    }

    public TransferMoneyListener getListenerForTransfer() {
        return listenerForTransfer;
    }

    public void setListenerForTransfer(TransferMoneyListener listenerForTransfer) {
        this.listenerForTransfer = listenerForTransfer;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
