package strategy.duck.ch04;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("울지 못합니다.");
    }
}
