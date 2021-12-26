/**
 * From Head First Design Patterns, Freeman & Robson
 */

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
