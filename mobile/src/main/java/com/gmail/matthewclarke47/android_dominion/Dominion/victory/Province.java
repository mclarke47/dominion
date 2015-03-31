package com.gmail.matthewclarke47.android_dominion.Dominion.victory;

import com.gmail.matthewclarke47.android_dominion.Dominion.Card;

public class Province extends Card {
    @Override
    public String toString() {
        return "Province";
    }

    @Override
    public int getStackSize() {
        return 12;
    }
}
