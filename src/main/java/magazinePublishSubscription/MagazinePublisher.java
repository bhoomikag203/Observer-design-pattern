package magazinePublishSubscription;

import java.util.ArrayList;
import java.util.List;

public class MagazinePublisher implements Publisher {
    private List<Subscriber> subscribers;

    private Magazine magazine;

    public MagazinePublisher() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        System.out.println("===========================================");
        this.subscribers.forEach(subscriber -> subscriber.update(this.magazine));
    }

    @Override
    public int countSubscribers() {
        return this.subscribers.size();
    }

    public void publishMagazine(Magazine magazine) {
        this.magazine = magazine;
        System.out.println("Publishing magazine");
        notifySubscribers();
    }
}