import java.util.ArrayList;
public class Waitress {
    ArrayList <Command> orders;

    public Waitress() {
        orders = new ArrayList<Command>();
    }
    public void takeOrder(Command order) {
        orders.add(order);
    }
    public void orderUp() {
        for (Command order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
