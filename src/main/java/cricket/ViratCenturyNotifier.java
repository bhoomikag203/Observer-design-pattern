package cricket;

import java.util.ArrayList;
import java.util.List;

public class ViratCenturyNotifier implements Notifier {
    List<Observer> fans;

    public ViratCenturyNotifier() {
        this.fans = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer instanceof ViratFan)
            this.fans.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.fans.remove(observer);
    }

    @Override
    public void notifyFans() {
        System.out.println("\nNotifying Virat fans");
        System.out.println("====================================================");
        this.fans.forEach(fan -> fan.announce());
    }

    @Override
    public int countFans() {
        return this.fans.size();
    }
}