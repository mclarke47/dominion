package com.gmail.matthewclarke47.android_dominion.Dominion;

import com.gmail.matthewclarke47.android_dominion.Dominion.deck.Deck;
import com.gmail.matthewclarke47.android_dominion.Dominion.deck.DeckBuilder;
import com.gmail.matthewclarke47.android_dominion.Dominion.treasure.TreasureSets;
import com.gmail.matthewclarke47.android_dominion.Dominion.victory.VictorySets;

public class Dominion {


    private int numPlayers;
    private Deck deck;

    public Dominion(int numPlayers) {

        this.numPlayers = numPlayers;

        DeckBuilder deckBuilder = new DeckBuilder();

        deck = deckBuilder.setVictory(VictorySets.BASE.getSet()).setTreasure(TreasureSets.BASE.getSet()).setAction(Expansion.BASE_GAME.getActionCards()).build();
    }

    public Deck getDeck(){
        return deck;
    }
}
