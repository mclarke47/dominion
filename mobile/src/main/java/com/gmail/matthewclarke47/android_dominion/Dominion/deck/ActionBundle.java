package com.gmail.matthewclarke47.android_dominion.Dominion.deck;

import com.gmail.matthewclarke47.android_dominion.Dominion.base.ActionCard;

import java.util.*;

public class ActionBundle {
    private List<ActionCard> types = new ArrayList<>();

    public ActionBundle(List<ActionCard> types) {
        this.types = types;
    }

    @Override
    public String toString() {

        String str = "\nAction Cards\n";
        for(ActionCard type : types){
            str = str + type.getClass().getSimpleName() + ": " + 10 + " ";
        }

        return str;
    }
}
