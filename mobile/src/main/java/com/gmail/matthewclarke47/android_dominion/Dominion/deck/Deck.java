package com.gmail.matthewclarke47.android_dominion.Dominion.deck;


import com.gmail.matthewclarke47.android_dominion.Dominion.Card;
import com.gmail.matthewclarke47.android_dominion.Dominion.CardContext;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.ActionCard;

import java.util.Collections;
import java.util.Map;

public class Deck {
    private Map<Card, CardContext> treasureBundle;
    private Map<Card, CardContext> victoryBundle;
    private Map<ActionCard, CardContext> actionBundle;

    public Deck(Map<Card, CardContext> treasureBundle, Map<Card, CardContext> victoryBundle, Map<ActionCard, CardContext> actionBundle) {

        this.treasureBundle = treasureBundle;
        this.victoryBundle = victoryBundle;
        this.actionBundle = actionBundle;
    }

    @Override
    public String toString() {
        return String.format("Deck %s %s %s", treasureBundle, victoryBundle, actionBundle);
    }

    public Map<ActionCard, CardContext> peekActionCards(){
        return Collections.unmodifiableMap(actionBundle);
    }
}
