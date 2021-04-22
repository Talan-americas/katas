package com.talan.kata.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FrameTest {

    @Test
    void createFrame() {
        Frame frame = new Frame();
        //TODO next week : what do we assert on the Frame ?
        frame.roll(3);
        frame.roll(4);
        assertThat(frame.getFirstRoll())
                .isEqualTo(3);
        assertThat(frame.getSecondRoll())
                .isEqualTo(4);
    }

    @Test
    void isSpare() {
        Frame frame = new Frame();
        frame.roll(3);
        frame.roll(7);
        assertThat(frame.isSpare()).isTrue();
    }

    @Test
    void isNotSpare() {
        Frame frame2 = new Frame();
        frame2.roll(3);
        frame2.roll(4);
        assertThat(frame2.isSpare()).isFalse();
    }

    @Test
    void isStrikeNotSpare() {
        Frame frame3 = new Frame();
        frame3.roll(10);
        assertThat(frame3.isSpare()).isFalse();
    }

    @Test
    void isStrike() {
        Frame frame = new Frame();
        frame.roll(10);
        assertThat(frame.isStrike()).isTrue();
    }

    @Test
    void isNotStrike() {
        Frame frame2 = new Frame();
        frame2.roll(3);
        frame2.roll(4);
        assertThat(frame2.isStrike()).isFalse();
    }

    @Test
    void isSpareNotStrike() {
        Frame frame3 = new Frame();
        frame3.roll(3);
        frame3.roll(7);
        assertThat(frame3.isStrike()).isFalse();
    }

}
