package cricket;

import java.util.ArrayList;
import java.util.List;

public class SachinCenturyNotifier implements Notifier {
    private List<Observer> fans;

    public SachinCenturyNotifier() {
        this.fans = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer instanceof SachinFan)
            this.fans.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.fans.remove(observer);
    }

    @Override
    public void notifyFans() {
        System.out.println("\nNotifying Sachin fans");
        System.out.println("====================================================");
        this.fans.forEach(fan -> fan.announce());
    }

    @Override
    public int countFans() {
        return this.fans.size();
    }

}