package com.talan.kata.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingGameTest {
    /*
     * Requirements:
     * 1 - Count the points
     * 2 - Display the game as String separated by pipes or any other format, like \"|3,4|5,/|X|3|\"
     *
     * Assume:
     * - Only one player
     * - All inputs will be valid (no negative score, no weird rolls, proper number of roll and frames)
     */

    @Test
    void roll_oneRoll_4() {
        BowlingGame game = new BowlingGame();

        game.roll(4);
        assertThat(game.getScore())
                .isEqualTo(4);
    }

    @Test
    void play_frame() {
        BowlingGame game = new BowlingGame();

        game.roll(3);
        game.roll(4);
        assertThat(game.getScore())
                .isLessThanOrEqualTo(10)
                .isEqualTo(7);

    }
}
