package org.terceira.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class DinoKeyboardHandler implements KeyboardHandler {

    private Picture pic;

    public DinoKeyboardHandler(Picture pic){

        this.pic = pic;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_UP:
                pic.translate(0,-10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
