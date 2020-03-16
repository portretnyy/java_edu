package Composition;

public class Collective {
    private TeamLead leader;
    private Senior master;
    private Middle specialist;
    private Junior rookie;

    public Collective(TeamLead leader, Senior master, Middle specialist, Junior rookie) {
        this.leader = leader;
        this.master = master;
        this.specialist = specialist;
        this.rookie = rookie;
    }

    public static void main(String[] args) {
        TeamLead sasha = new TeamLead("Александр", 100_000);
        Senior andrew = new Senior("Андрей", 80_000, 33);
        Middle george = new Middle("Георгий", 60_000);
        Junior ivan = new Junior("Иван", 40_000, true);
        Collective best = new Collective(sasha, andrew, george, ivan);
    }
}
