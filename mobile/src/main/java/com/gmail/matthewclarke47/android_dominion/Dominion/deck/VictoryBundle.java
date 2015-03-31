package com.gmail.matthewclarke47.android_dominion.Dominion.deck;

import com.gmail.matthewclarke47.android_dominion.Dominion.victory.Duchy;
import com.gmail.matthewclarke47.android_dominion.Dominion.victory.Estate;
import com.gmail.matthewclarke47.android_dominion.Dominion.victory.Province;

import java.util.List;

public class VictoryBundle {
    private List<Estate> estates;
    private List<Duchy> duchies;
    private List<Province> provinces;

    public VictoryBundle(List<Estate> estates, List<Duchy> duchies, List<Province> provinces) {
        this.estates = estates;
        this.duchies = duchies;
        this.provinces = provinces;
    }

    @Override
    public String toString() {
        return String.format("\nVictory\nEstates: %d, Duchies: %d, Provinces: %d", estates.size(), duchies.size(), provinces.size());
    }
}
