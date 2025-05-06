package SoccerOOPProject;

import java.util.ArrayList;
import java.util.List;

public class Round {

    private List<Match> matches;

    public Round() {
        this.matches = new ArrayList<>();
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public List<Team> playRound() {

        List<Team> winners = new ArrayList<>();

        System.out.println("\n=== Starting Round ===");

        for (Match match : matches) {
            match.playMatch();
            winners.add(match.getWinner());
        }

        System.out.println("=== Round complete ===\n");

        return winners;
    }
}
