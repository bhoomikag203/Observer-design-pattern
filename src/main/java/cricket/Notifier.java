package cricket;

public interface Notifier {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyFans();
    int countFans();
}
