package strategy.duck.ch02;

public class RubberDuck extends Duck{

    @Override
    public void display() {
        System.out.println("고무오리 모양");
    }

    @Override
    public void quack() {
        System.out.println("고무오리는 삑삑 소리를 냅니다.");
    }

    @Override
    public void fly() {
        System.out.println("고무오리는 날 수 없습니다.");
    }
}
