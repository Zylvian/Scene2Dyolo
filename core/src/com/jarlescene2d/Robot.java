package com.jarlescene2d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;


class Robot extends Piece {
        Sprite sprite = new Sprite(new Texture(Gdx.files.internal("rolobot.png")));

        @Override
        public void draw(Batch batch, float parentAlpha) {
            batch.draw(sprite, getX(),getY(), getWidth(), getHeight());
        }
}
