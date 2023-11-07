public class Customer {
    Waitress waitress;
    public Customer(Waitress waitress) {
        this.waitress = waitress;
    }

    public void createOrder(Command command) {
        waitress.takeOrder(command);
    }
}
