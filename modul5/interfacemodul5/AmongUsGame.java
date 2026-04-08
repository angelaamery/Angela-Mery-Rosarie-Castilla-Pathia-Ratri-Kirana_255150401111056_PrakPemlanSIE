package interfacemodul5;

public class AmongUsGame {

    public static void main(String[] args) {

        Crew brian, cindy, david;
        Impostor jacky;

        brian = new Crew("Brian");
        cindy = new Crew("Cindy");
        david = new Crew("David");
        jacky = new Impostor("Jacky");

        brian.doWork();
        cindy.doWork();
        david.doWork();
        jacky.doWork();

        // Kill
        jacky.kill(cindy);

        // Meeting
        david.callMeeting();

        // Check impostor
        AmongUsGame.check(brian);
        AmongUsGame.check(david);
        AmongUsGame.check(jacky);

        // Crew mati coba meeting
        cindy.callMeeting();

        // Kick
        AmongUsGame.kick(brian);
        AmongUsGame.kick(jacky);
    }

    public static void check(ICrew crew) {
        if (AmongUsGame.isImpostor(crew)) {
            System.out.println(crew.getName() + " is the impostor!");
        } else {
            System.out.println(crew.getName() + " is not the impostor.");
        }
    }

    public static boolean isImpostor(ICrew crew) {
        return (crew instanceof Impostor);
    }

    // GENERALISASI INTERFACE
    public static void kick(IKickable obj) {
        obj.kick();
    }
}