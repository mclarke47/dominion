package com.gmail.matthewclarke47.android_dominion;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.gmail.matthewclarke47.android_dominion.Dominion.CardContext;
import com.gmail.matthewclarke47.android_dominion.Dominion.Dominion;
import com.gmail.matthewclarke47.android_dominion.Dominion.base.ActionCard;

import java.util.ArrayList;
import java.util.Map;

public class GameBoard  extends ListActivity {

    private Dominion dominion;

    ArrayAdapter<String> adapter ;
    ArrayList<String> listItems=new ArrayList<>();
    private int numPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);
        adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                listItems);

        setListAdapter(adapter);
        numPlayers = getIntent().getExtras().getInt("numPlayers");

        generateDeck();

        final Button button = (Button) findViewById(R.id.regenerateButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adapter.clear();
                generateDeck();

            }
        });
    }

    private void generateDeck(){
        dominion =  new Dominion(numPlayers);

        Map<ActionCard, CardContext> actionCardMap = dominion.getDeck().peekActionCards();

        for(ActionCard actionCard : actionCardMap.keySet()){
            adapter.add(actionCard.getClass().getSimpleName());
        }
    }
}
