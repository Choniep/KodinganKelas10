package notifikasi;

public interface InterfaceNotifikasi {
    abstract void sendMessage(String receiver, String content);

    void call();
}
