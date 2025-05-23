package SoccerOOPProject;

import java.util.Random;

public class Match {
    private Team team1;
    private Team team2;
    private Team winner;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.winner = null; // will be set later
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public void playMatch() {

        Random randomizer = new Random();

        winner = randomizer.nextBoolean() ? team1 : team2;

        System.out.println("Match: " + team1.getName() + " vs " + team2.getName() +
                " — Winner: " + winner.getName());

    }
}