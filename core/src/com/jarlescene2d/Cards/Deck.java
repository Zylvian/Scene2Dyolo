package com.jarlescene2d.Cards;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class Deck extends Table {

    public Deck(Skin skin){

        this.setDebug(true);
        this.left().bottom();
        for(int i = 0; i< 3; i++){
            this.add(new Card(skin));
        }

    }

}
