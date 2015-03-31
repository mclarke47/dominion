package com.gmail.matthewclarke47.android_dominion.Dominion.deck;


import com.gmail.matthewclarke47.android_dominion.Dominion.treasure.Copper;
import com.gmail.matthewclarke47.android_dominion.Dominion.treasure.Gold;
import com.gmail.matthewclarke47.android_dominion.Dominion.treasure.Silver;

import java.util.List;

public class TreasureBundle {
    private List<Copper> coppers;
    private List<Silver> silvers;
    private List<Gold> gold;

    public TreasureBundle(List<Copper> coppers, List<Silver> silvers, List<Gold> gold){
        this.coppers = coppers;
        this.silvers = silvers;
        this.gold = gold;
    }

    @Override
    public String toString() {
        return String.format("\nTreasures\nCoppers: %d, Silvers: %d, Gold: %d", coppers.size(), silvers.size(), gold.size());
    }

    public boolean contains(String card) {

        return Copper.class.getSimpleName().toLowerCase().equals(card.toLowerCase()) ||
                Silver.class.getSimpleName().toLowerCase().equals(card.toLowerCase()) ||
                Gold.class.getSimpleName().toLowerCase().equals(card.toLowerCase());
    }
}
