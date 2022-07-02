package singleton;

public class Main {
    public static void main(String[] args) {
        AClass aClass = new AClass();
        BClass bClass = new BClass();

        SocketClient aClient = aClass.getSocketClient();
        SocketClient bClient = bClass.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
    }
}
