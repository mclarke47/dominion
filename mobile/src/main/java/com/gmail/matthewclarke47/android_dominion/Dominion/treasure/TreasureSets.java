package com.gmail.matthewclarke47.android_dominion.Dominion.treasure;

import com.gmail.matthewclarke47.android_dominion.Dominion.Card;

import java.util.HashSet;
import java.util.Set;

public enum TreasureSets {
    BASE{
        @Override
        public Set<Card> getSet() {
            Set<Card> treasureSet = new HashSet<>();
            treasureSet.add(new Copper());
            treasureSet.add(new Silver());
            treasureSet.add(new Gold());
            return treasureSet;
        }
    };
    public abstract Set<Card> getSet();
}
