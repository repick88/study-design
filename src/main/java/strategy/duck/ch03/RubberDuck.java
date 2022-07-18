package strategy.duck.ch03;

public class RubberDuck extends Duck implements Quackable{

    @Override
    public void display() {
        System.out.println("고무오리 모양");
    }

    @Override
    public void quack() {
        System.out.println("고무오리는 삑삑 소리를 냅니다.");
    }
}
