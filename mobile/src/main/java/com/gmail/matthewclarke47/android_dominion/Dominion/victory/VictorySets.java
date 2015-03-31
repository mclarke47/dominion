package com.gmail.matthewclarke47.android_dominion.Dominion.victory;

import com.gmail.matthewclarke47.android_dominion.Dominion.Card;

import java.util.HashSet;
import java.util.Set;

public enum VictorySets {
    BASE{
        @Override
        public Set<Card> getSet() {
            Set<Card> victorySet = new HashSet<>();
            victorySet.add(new Estate());
            victorySet.add(new Duchy());
            victorySet.add(new Province());
            return victorySet;
        }
    };
    public abstract Set<Card> getSet();
}
