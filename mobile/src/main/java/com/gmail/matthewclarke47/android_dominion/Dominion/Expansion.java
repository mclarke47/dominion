package com.gmail.matthewclarke47.android_dominion.Dominion;

import com.gmail.matthewclarke47.android_dominion.Dominion.base.ActionCard;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Adventurer;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Bureaucrat;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Cellar;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Chancellor;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Chapel;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.CouncilRoom;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Feast;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Festival;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Gardens;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Laboratory;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Library;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Market;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Militia;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Mine;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Moat;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Moneylender;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Remodel;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Smithy;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Spy;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Theif;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.ThroneRoom;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Village;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Witch;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Woodcutter;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.Workshop;

import java.util.HashSet;
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

