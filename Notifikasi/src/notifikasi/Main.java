package notifikasi;

public class Main {

    public static void main(String[] args) {
        String emailPenerima = "rehanbaik@gmail.com";
        String nomerHP = "+625489204522055";
        String mobileId = "iOS-minchuuy";

        EmailNotification emailNotif = new EmailNotification();
        SMSnotification smsNotif = new SMSnotification();
        PushNotification pushNotif = new PushNotification();

        String message = "Tutorial Polimorfisme sudah terbit di HP rehan";

        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHP, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
