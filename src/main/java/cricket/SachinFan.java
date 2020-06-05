package cricket;

public class SachinFan implements Observer {

    private String name;

    public SachinFan(String name) {
        this.name = name;
    }

    @Override
    public void announce() {
        System.out.println("Hey " + name +", it's time to celebrate. Sachin scored century!!");
    }
}