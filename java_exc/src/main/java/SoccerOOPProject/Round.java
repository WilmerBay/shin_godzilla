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

    public void playAllMatches() {
        for (Match match : matches) {
            match.playMatch(); // placeholder logic
        }
    }
}
