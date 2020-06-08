package cricket;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NotifyFans {

    @Test
    public void shouldNotifyViratFans() {
        ViratCenturyNotifier viratCenturyNotifier = new ViratCenturyNotifier();
        ViratFan anushka = new ViratFan("Anushka");
        ViratFan krish = new ViratFan("Krish");

        viratCenturyNotifier.register(anushka);
        viratCenturyNotifier.register(krish);
        viratCenturyNotifier.notifyFans();
        Assert.assertEquals(viratCenturyNotifier.countFans(), 2);
    }

    @Test
    public void shouldNotifySachinFans() {
        SachinCenturyNotifier sachinCenturyNotifier = new SachinCenturyNotifier();

        SachinFan alice = new SachinFan("Alice");
        SachinFan bob = new SachinFan("Bob");
        SachinFan ash = new SachinFan("Ash");

        sachinCenturyNotifier.register(alice);
        sachinCenturyNotifier.register(bob);
        sachinCenturyNotifier.register(ash);
        sachinCenturyNotifier.notifyFans();

        sachinCenturyNotifier.unregister(alice);
        sachinCenturyNotifier.notifyFans();
        Assert.assertEquals(sachinCenturyNotifier.countFans(), 2);

    }


}