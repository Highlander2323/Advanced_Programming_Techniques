package Lab06_Generics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO: Make this class generic so it can hold scores of any comparable type T.
 * TODO: Use T extends Comparable<T> — scores must be rankable.
 * TODO: Store players and their scores in a LinkedHashMap<Player, T>.
 */
public class Leaderboard /* TODO: add bounded type parameter */ {

    private Map<Player, /* TODO */> scores = new LinkedHashMap<>();

    /**
     * TODO: Add or replace the score for the given player.
     */
    // Adds or updates the score of a player on the leaderboard.
    // Adaugă sau actualizează scorul unui jucător pe clasament.
    public void addScore(Player player, /* TODO */ Object score) {
        // IMPLEMENT
    }

    /**
     * TODO: Return a List<Player> of the top N players sorted by score descending.
     * TODO: Hint: copy the entry set to a list and sort it using Comparator.
     */
    // Returns the top N players ranked by score from highest to lowest.
    // Returnează primii N jucători ordonați descrescător după scor.
    public List<Player> getTopN(int n) {
        // IMPLEMENT
        return null;
    }

    /**
     * TODO: Return the score for the given player.
     * TODO: Throw PlayerNotFoundException if the player is not on the leaderboard.
     */
    // Returns the score of a specific player; throws PlayerNotFoundException if absent.
    // Returnează scorul unui jucător specific; aruncă PlayerNotFoundException dacă lipsește.
    public /* TODO */ Object getScore(Player player) {
        // IMPLEMENT
        return null;
    }

    /**
     * TODO: Print all players and their scores ranked from highest to lowest.
     */
    // Prints all players and scores in descending order of score.
    // Afișează toți jucătorii și scorurile în ordine descrescătoare.
    public void printRankings() {
        // IMPLEMENT
    }
}
