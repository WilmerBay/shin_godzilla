package SoccerOOPProject;

public class Main {

    Player zeke = new Player("zeke", "right wing", 25);
    Player wilmer = new Player("wilmer", "right wing", 17);
    Team calyx = new Team("Team Calyx");
    Team exodus = new Team("Team Exodus");
    Team dynamite = new Team("Team Dynamite");
    Team rushdown = new Team("Team Rushdown");
    Match match1 = new Match(calyx, exodus);
    Match match2 = new Match(dynamite, rushdown);



}
