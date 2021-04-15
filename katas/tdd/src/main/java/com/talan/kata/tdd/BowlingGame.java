package com.talan.kata.tdd;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    /*
     * Requirements:
     * 1 - Count the points
     * 2 - Display the game as String separated by pipes or any other format, like \"|3,4|5,/|X|3|\"
     *
     * Assume:
     * - Only one player
     * - All inputs will be valid (no negative score, no weird rolls, proper number of roll and frames)
     */

    List<Integer> rolls = new ArrayList<>();

    public int roll(int p) {
        rolls.add(p);
        return p;
    }

    public int getScore() {
        return rolls.stream().mapToInt(Integer::intValue).sum();
    }

}
