package strategy.duck.ch03;

public class RedheadDuck extends Duck implements Flyable, Quackable{
    @Override
    public void display() {
        System.out.println("아메리칸흰죽지오리 모양");
    }

    @Override
    public void fly() {
        System.out.println("오리는 날 수 있습니다.");
    }

    @Override
    public void quack() {
        System.out.println("오리는 소리 낼 수 있습니다.");
    }
}
