package strategy.callcenter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에 할당 ");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");
        System.out.println("A : 상담원이 상담가져가기");

        int ch = System.in.read();

        Scheduler scheduler = null;

        if(ch == 'r' || ch == 'R'){
            scheduler = new RoundRobin();
        }else if(ch == 'l' || ch == 'L'){
            scheduler = new LeastJob();
        }else if(ch == 'p' || ch == 'P'){
            scheduler = new PriorityAllocation();
        }else if(ch == 'a' || ch == 'A'){
            scheduler = null; //추가로 추가해도 다른 클래스에 영향을 미치지 않는다.
        }else {
            System.out.println("not support!");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
