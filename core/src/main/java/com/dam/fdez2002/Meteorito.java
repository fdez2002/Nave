package com.dam.fdez2002;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import org.w3c.dom.Text;

public class Meteorito extends Actor {
    private  Texture  rocaGrande ;
    public Rectangle bb;

    public Meteorito() {
        rocaGrande = new Texture("roca-grande.png");


    }
    @Override
    public void act(float delta) {

    }
    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(rocaGrande, getX(), getY());
    }
}
