package patterns.behavioral.strategy;

public class FootballPlayer {
    private Kick kick;

    public void setKick(Kick kick) {
        this.kick = kick;
    }

    public void kick() {
        kick.execute();
    }
}
