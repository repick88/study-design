package strategy.duck.ch03;

public abstract class Duck {

    public void swim() {
        System.out.println("오리는 헤엄을 칩니다.");
    }

    /*모든 오리들의 모양이 나르기 때문에 display() 메소드는 추상 메소드*/
    public abstract void display();

}
