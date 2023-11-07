public class Main {
    public static void main(String[] args){
        ShortOrderCook cook = new ShortOrderCook();
        Waitress waitress = new Waitress();
        Customer customer = new Customer(waitress);
        customer.createOrder(new BurgerCommand(cook));
        customer.createOrder(new ShakeCommand(cook));

        waitress.orderUp();
    }
}
