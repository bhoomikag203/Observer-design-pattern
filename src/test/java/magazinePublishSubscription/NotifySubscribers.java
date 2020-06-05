package magazinePublishSubscription;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NotifySubscribers {

    @Test
    public void shouldNotifySubscribers() {

        Magazine magazineOne = new Magazine("The Venture");
        MagazinePublisher magazinePublisher = new MagazinePublisher();

        MagazineSubscriber ash = new MagazineSubscriber("Ash");
        MagazineSubscriber bob = new MagazineSubscriber("Bob");

        magazinePublisher.addSubscriber(ash);
        magazinePublisher.addSubscriber(bob);
        magazinePublisher.publishMagazine(magazineOne);
        Assert.assertEquals(magazinePublisher.countSubscribers(), 2);

        Magazine magazineTwo = new Magazine("Fashion");
        magazinePublisher.removeSubscriber(ash);
        magazinePublisher.publishMagazine(magazineTwo);
        Assert.assertEquals(magazinePublisher.countSubscribers(), 1);
    }

}