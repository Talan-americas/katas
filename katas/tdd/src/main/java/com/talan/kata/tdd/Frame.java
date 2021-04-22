package com.talan.kata.tdd;

public class Frame {

    private State state;
    private Roll roll;
    private int firstRoll, secondRoll;

    public Frame() {
        firstRoll = -1;
        secondRoll = -1;
        roll = Roll.NOROLL;
        state = State.REGULAR;
    }

    public int getFirstRoll() {
        return firstRoll;
    }

    public int getSecondRoll() {
        return secondRoll;
    }

    public void roll(int rollInt) {
        if (roll.equals(Roll.NOROLL)) {
            firstRoll = rollInt;
            roll = Roll.ROLLONE;
            // TO DO - HANDLE STRIKE
        } else {
            secondRoll = rollInt;
        }
    }

    public boolean isSpare() {
        return getFirstRoll() + getSecondRoll() == 10 && getFirstRoll() != -1 && getSecondRoll() != -1;
    }

    public boolean isStrike() {
        return getFirstRoll() == 10;
    }

    public static enum Roll {NOROLL, ROLLONE, ROLLFINISHED}

    public static enum State {REGULAR, SPARE, STRIKE}
}
