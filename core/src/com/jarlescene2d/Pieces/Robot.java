package com.jarlescene2d.Pieces;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;


public class Robot extends Piece {
        String path = "";

        public Robot(int robotNumber){

                switch (robotNumber){
                        case 0:
                                path = "rolobot-alpha.png";
                                break;
                        case 1:
                                path = "sputnik.png";
                                break;
                }

                sprite = new Sprite(new Texture(Gdx.files.internal(path)));
        }

        /*@Override
        public void draw(Batch batch, float parentAlpha) {
           //batch.enableBlending();
            batch.draw(sprite, getX(),getY(), getWidth(), getHeight());
        }*/
}