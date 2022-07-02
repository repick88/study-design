package proxy;

public class Main {
    public static void main(String[] args) {
        /*
        Browser browser = new Browser("www.naver.com");
        //여러번 호출하면 매번 생성한다. 즉 캐시 기능이 없다.
        browser.show();
        browser.show();
        browser.show();
        */
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
    }
}
