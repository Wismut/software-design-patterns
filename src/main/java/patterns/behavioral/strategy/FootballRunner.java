package patterns.behavioral.strategy;

public class FootballRunner {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.setKick(new FreeKick());
        footballPlayer.kick();
        footballPlayer.setKick(new DropKick());
        footballPlayer.kick();
        footballPlayer.setKick(new KickOff());
        footballPlayer.kick();
        footballPlayer.setKick(new SafetyKick());
        footballPlayer.kick();
    }
}
