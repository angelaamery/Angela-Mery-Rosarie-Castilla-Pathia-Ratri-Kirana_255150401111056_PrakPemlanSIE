package interfacemodul5;

public class Crew implements ICrew, IKickable {

    private String name;
    boolean isAlive;

    public Crew(String name) {
        this.name = name;
        this.isAlive = true;
    }

    @Override
    public String getName() {
        return name;
    }

    public void doWork() {
        System.out.println("Crew " + name + " is doing work.");
    }

    public void callMeeting() {
        if (!isAlive) {
            System.out.println(name + " is dead and cannot call a meeting.");
            return;
        }

        System.out.println(name + " found a corpse and calls a meeting. Let's find the impostor!");
    }

    @Override
    public void kick() {
        System.out.println(name + " has been kicked out from the spaceship.");
    }
}