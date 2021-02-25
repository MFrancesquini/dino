package org.terceira.academiadecodigo.bootcamp;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CactusMove {
    private static Picture cactus;

    public static void cactus() throws InterruptedException {
        cactus = new Picture(970,265,"resources/cactus-bg.png");
        cactus.draw();
        MoveCactusTowards.moveCactus();
    }

    public static class MoveCactusTowards {

        public static void moveCactus() throws InterruptedException {



            while (true){
                if (cactus.getX() < Game.rec.getX()){
                    cactus.delete();
                    cactus = new Picture(970,265,"resources/cactus-bg.png");
                    cactus.draw();

                }
                cactus.translate(-3, 0);
                Thread.sleep(30);
            }
        }
    }
}
