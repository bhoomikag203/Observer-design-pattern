package magazinePublishSubscription;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers();

    int countSubscribers();
}
