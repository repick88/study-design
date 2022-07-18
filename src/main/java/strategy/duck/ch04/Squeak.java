package strategy.duck.ch04;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑!");
    }
}
