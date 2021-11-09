package com.company.model;

import com.company.controller.ScoreboardBase;

public class SquareBalloon extends ScoreboardBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
