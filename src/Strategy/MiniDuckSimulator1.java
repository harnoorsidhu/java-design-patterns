/**
 * From Head First Design Patterns, Freeman & Robson
 */

public class MiniDuckSimulator1 {
    
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        System.out.println("---------------------");
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
    
}

