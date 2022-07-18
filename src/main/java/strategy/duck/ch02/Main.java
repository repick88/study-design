package strategy.duck.ch02;

public class Main {
    public static void main(String[] args) {
        MallardDouck mallardDouck = new MallardDouck();
        mallardDouck.quack();
        mallardDouck.swim();
        mallardDouck.display();
        mallardDouck.fly();

        System.out.println("===========================");

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.display();
        redheadDuck.fly();

        System.out.println("===========================");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.fly();

        System.out.println("===========================");
        System.out.println("유인용오리가 의도와 다르게 동작");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.quack();
        decoyDuck.swim();
        decoyDuck.display();
        decoyDuck.fly();
    }
}
