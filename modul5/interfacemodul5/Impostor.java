package interfacemodul5;

public class Impostor implements ICrew, IKickable {

    private String name;

    public Impostor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void doWork() {
        System.out.println("Impostor " + name + " is doing work.");
    }

    public void kill(ICrew crew) {
        System.out.println(crew.getName() + " has been killed!");

        if (crew instanceof Crew) {
            Crew target = (Crew) crew;
            target.isAlive = false;
        }
    }

    @Override
    public void kick() {
        System.out.println(name + " has been kicked out from the spaceship.");
    }
}