package com.gmail.matthewclarke47.android_dominion.Dominion.deck;

import com.gmail.matthewclarke47.android_dominion.Dominion.Card;
import com.gmail.matthewclarke47.android_dominion.Dominion.CardContext;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.ActionCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeckBuilder {

    private Map<Card, CardContext> treasureCards = new HashMap<>();
    private Map<Card, CardContext> victoryCards = new HashMap<>();
    private Map<ActionCard, CardContext> actionCards = new HashMap<>();


    public Deck build() {

        return new Deck(treasureCards, victoryCards, actionCards);
    }

    public DeckBuilder setVictory(Set<Card> set) {
        for (Card card : set){
            victoryCards.put(card, new CardContext(card.getStackSize()));
        }
        return this;
    }

    public DeckBuilder setTreasure(Set<Card> set) {
        for (Card card : set){
            treasureCards.put(card, new CardContext(card.getStackSize()));
        }
        return this;
    }

    public DeckBuilder setAction(Set<ActionCard> set) {

        List<ActionCard> tempList = new ArrayList();
        tempList.addAll(set);
        Collections.shuffle(tempList);

        for (int i = 0; i < 10; i++ ) {
            actionCards.put(tempList.get(i), new CardContext(ActionCard.STACK_SIZE));
        }
        return this;
    }

}


