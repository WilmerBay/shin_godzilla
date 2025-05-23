package SoccerOOPProject;

import java.util.ArrayList;
import java.util.List;

public class Tournament {

    private String name;
    private List<Team> teams;
    private List<Round> rounds;
    private Team winner;

    public Tournament(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.rounds = new ArrayList<>();
        this.winner = null;
    }
    public String getName() {
        return name;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public Team getWinner() {
        return winner;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void startTournament() {

    }
}

