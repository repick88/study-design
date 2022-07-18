package strategy.duck.ch04;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥!");
    }
}
