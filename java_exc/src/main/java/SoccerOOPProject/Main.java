package SoccerOOPProject;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

    Player zeke = new Player("zeke", "right wing", 25);
    Player wilmer = new Player("wilmer", "right wing", 17);

    Team atlas = new Team("Team Atlas");
    Team aeolus = new Team("Team Aeolus");
    Team siarnaq = new Team("Team Siarnaq");
    Team thetis = new Team("Team Thetis");
    Team calyx = new Team("Team Calyx");
    Team exodus = new Team("Team Exodus");
    Team dynex = new Team("Team Dynex");
    Team fefnir = new Team("Team Fefnir");

    Match match1 = new Match(calyx, exodus);
    Match match2 = new Match(dynex, fefnir);

    atlas.addPlayer(zeke);
    atlas.addPlayer(wilmer);

    Tournament tournament = new Tournament("Champions Cup");

    tournament.addTeam(atlas);
    tournament.addTeam(aeolus);
    tournament.addTeam(siarnaq);
    tournament.addTeam(thetis);
    tournament.addTeam(calyx);
    tournament.addTeam(exodus);
    tournament.addTeam(dynex);
    tournament.addTeam(fefnir);

    tournament.startTournament();

    }
}
