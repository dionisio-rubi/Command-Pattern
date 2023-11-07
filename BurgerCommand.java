public class BurgerCommand implements Command{
    ShortOrderCook cook;

    public BurgerCommand(ShortOrderCook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.makeBurger();
    }
}
