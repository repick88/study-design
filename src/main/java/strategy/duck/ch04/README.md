1. (ch01)문제 수행
- 표준 객체지향 기법을 이용하여 Duck라는 슈퍼클래스를 확장하여 다른 모든 종류의 오리를 만듬.

2. (ch02)문제 수행
- 추가 요청으로 오리가 날 수 있게 Duck 슈퍼클래스에 추가.
- Duck 클래스에 fly() 메소드만 추가하면 모든 오리들이 그걸 상속 받겠지? 후훗- 

3. (ch02)문제 발생
- RubberDuck도 fly가 되는 상황 발생!!! 즉 코드의 한 부부만을 바꿈으로 해서 프로그램 전체에 부작용(고무오리가 날아다니는 상황)이 발생하게 되었습니다. 

4. (ch03)문제 해결
- quack() 메소드에서 이미 했던 것처럼 fly() 메소드도 그냥 오버라이드하면 되지 않을까? 
- 프로그램에 나무로 된 가짜 오리를 추가하게 되면 어떻게 해야 되지? 날 수도 없고 소리도 낼 수 없어야 할텐데?
- 상속을 활용하는 것이 옳은 해법이 아닐지도 모른다. 앞으로 계속 추가되는 오리가 발생할 것이고 그렇게 된다면 매번 전에 프로그램에 추가했던 Duck의 서브클래스의 fly()와 quack()메소드를 일일이 살펴봐야 하고, 상황에 따라 오버라이드해야 할 수도 있으니깐
- 결국 (전체가 아닌) 일부 형식의 오리만 날거나 꽥꽥거릴 수 있도록 하는 방법을 찾아야 한다.

5. (ch03)문제 수행
- 인터페이스로 해결하면 어떨까?.?
- fly()를 Duck 슈퍼클래스에서 빼고 fly()메소드가 들어 있는 Flyable 인터페이스를 만들어, 날 수 있는 오리들에 대해서만 그 인터페이스를 구현해서 fly()메소드를 집어넣자
- 모든 오리들이 꽥꽥거리는 건 아니니깐 Quackable이라는 인터페이스도 만들어 해결하자

6. (ch03)문제 발생
- 코드 중복이 발생한다. 메소드 몇 개 오버라이드해야 하는게 안좋다면, 날아가는 동작을 조금 바꾸기 위해 Duck의 서브클래스 가운데 날아다닐 수 있는 모든 코드(오리가 천마리라고하면....끔찍)를 고쳐야하는 한다.
- 모든 서브클래스에 날거나 꽥꽥거리는 기능이 있어야 하는 것은 아니므로 상속을 사용하는 것이 올바른 해결책이 아니라는 것은 알 수 있습니다.
- 서브클래스에서 Flyable, Quackable을 구현하도록 함으로써 (고무 오리가 날아다니는 것처럼 이상한 일이 일어나는 것과 같은) 일부 문제점은 해결할 수 있지만, 그렇게 하면 그러한 행동에 대한 코드 재사용을 전혀 기대할 수 없게 되므로 코드 관리 면에 있어서 또 다른 커다란 문제점이 생기게 됩니다. 물론 날 수 있는 오리 중에서도 날아다니는 방식이 서로 다를 수도 있습니다. 

7. (ch04)문제 파악
- 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시칸다. (캡슐화) 즉, 코드에 새로운 요구사항이 있을 때마다 바뀌는 부분이 있다면, 그 행동을 바뀌지 않는 다른 부분으로부터 골라내서 분리해야 해야 한다.
- "바뀌는 부분은 따로 뽑아서 캡슐화시킨다. 그렇게 하면 나중에 바뀌지 않는 부분에는 영향을 미치지 않은 채로 그 부분만 고치거나 확장할 수 있다." / 모든 패턴은 '시스템의 일부분을 다른 부분과 독립적으로 변화시킬 수 있는' 방법을 제공하기 위한 것

8. (ch04)문제 해결