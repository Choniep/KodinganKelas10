package notifikasi;

public class SMSnotification implements InterfaceNotifikasi {

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim SMS ke " + receiver + " dengan isi: ");
        System.out.println(content);
    }
}
