package com.gmail.matthewclarke47.android_dominion.Dominion;

import com.gmail.matthewclarke47.android_dominion.Dominion.base.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public enum Expansion {



    BASE_GAME{
        public final Set<ActionCard> actionCards = new HashSet<>();
        {
            actionCards.add(new Adventurer());
            actionCards.add(new Bureaucrat());
            actionCards.add(new Cellar());
            actionCards.add(new Chancellor());
            actionCards.add(new Chapel());
            actionCards.add(new CouncilRoom());
            actionCards.add(new Feast());
            actionCards.add(new Festival());
            actionCards.add(new Gardens());
            actionCards.add(new Laboratory());
            actionCards.add(new Library());
            actionCards.add(new Market());
            actionCards.add(new Militia());
            actionCards.add(new Mine());
            actionCards.add(new Moat());
            actionCards.add(new Moneylender());
            actionCards.add(new Remodel());
            actionCards.add(new Smithy());
            actionCards.add(new Spy());
            actionCards.add(new Theif());
            actionCards.add(new ThroneRoom());
            actionCards.add(new Village());
            actionCards.add(new Witch());
            actionCards.add(new Woodcutter());
            actionCards.add(new Workshop());



        }

        @Override
        public Set<ActionCard> getActionCards() {
            return actionCards;
        }

    };
    public abstract Set<ActionCard> getActionCards();

}

