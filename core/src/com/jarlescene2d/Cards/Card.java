package com.jarlescene2d.Cards;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.google.gwt.validation.client.impl.Group;

public class Card extends Table {

        private Label text;

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
    }

    public Card(Skin skin){
            // Table stuff
            this.setDebug(true);
            this.left().bottom();

            //Label priority = new Label("500", skin);
            //Label description = new Label("Move 5", skin);

            ImageTextButton btn = new ImageTextButton("500 \n \n Rotate 180", skin);

            this.add(btn).bottom();
            /* this.add(priority);
            this.row();
            this.row();
            this.add(description);*/
        }

}