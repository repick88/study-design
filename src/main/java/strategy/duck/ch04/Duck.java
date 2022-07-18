package strategy.duck.ch04;

import strategy.duck.ch03.Quackable;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void swim() {
        System.out.println("오리는 헤엄을 칩니다.");
    }
    /*모든 오리들의 모양이 나르기 때문에 display() 메소드는 추상 메소드*/
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
