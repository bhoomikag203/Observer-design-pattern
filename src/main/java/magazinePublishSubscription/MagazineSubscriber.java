package magazinePublishSubscription;

public class MagazineSubscriber implements Subscriber {
    private String name;

    public MagazineSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Magazine magazine) {
        System.out.println("Notifying " + this.name + "\nMagazine Title : " + magazine.getTitle() + "\n");
    }
}