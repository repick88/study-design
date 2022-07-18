package strategy.duck.ch04;

public class Main {
    public static void main(String[] args) {
        //MallardDouck mallardDouck = new MallardDouck();
        Duck mallardDouck = new MallardDouck();
        mallardDouck.performQuack();
        mallardDouck.swim();
        mallardDouck.display();
        mallardDouck.performFly();

        System.out.println("===========================");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
