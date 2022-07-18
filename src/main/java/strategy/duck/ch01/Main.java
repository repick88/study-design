package strategy.duck.ch01;

public class Main {
    public static void main(String[] args) {
        MallardDouck mallardDouck = new MallardDouck();
        mallardDouck.quack();
        mallardDouck.swim();
        mallardDouck.display();

        System.out.println("===========================");

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.display();
    }
}
