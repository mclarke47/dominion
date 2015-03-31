package com.gmail.matthewclarke47.android_dominion.Dominion.treasure;

import com.gmail.matthewclarke47.android_dominion.Dominion.Card;

public class Gold extends Card {
    @Override
    public String toString() {
        return "Gold";
    }

    @Override
    public int getStackSize() {
        return 30;
    }
}
