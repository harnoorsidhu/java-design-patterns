/**
 * From Head First Design Patterns, Freeman & Robson
 */

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck  rubberDuckie = new RubberDuck();
        DecoyDuck   decoy = new DecoyDuck(); 
        ModelDuck   model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        System.out.println("---------------------");

        model.performFly(); 
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }

}
