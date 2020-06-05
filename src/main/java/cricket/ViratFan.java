package cricket;

public class ViratFan implements Observer {

    private String name;

    public ViratFan(String name) {
        this.name = name;
    }

    @Override
    public void announce() {
        System.out.println("Hey " + name +", it's time to celebrate. Virat scored century!!");
    }
}