public class ShakeCommand implements Command{
    ShortOrderCook cook;
    public ShakeCommand(ShortOrderCook cook) {
        this.cook = cook;
    }
    public void execute() {
        cook.makeShake();
    }
}