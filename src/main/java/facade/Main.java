package facade;

public class Main {
    public static void main(String[] args) {
        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();
        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();
        Reader reader = new Reader("test.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();

        /*facade 디자인 패턴 적용*/
        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/host/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
    }
}
