package org.terceira.academiadecodigo.bootcamp;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private static Picture pic;
    public static Rectangle rec;
    public static Picture backgroung;

    public static void init() throws InterruptedException {
        rec = new Rectangle(Constants.PADDING,Constants.PADDING,600,200);
        rec.fill();
        rec.setColor(Color.WHITE);

        backgroung = new Picture(Constants.PADDING,Constants.PADDING,"resources/background.png");
        backgroung.draw();

        pic = new Picture(6,247,"resources/dino-bg.png");
        pic.draw();

        dinoControls();
        CactusMove.cactus();
    }

    public static void dinoControls(){
        DinoKeyboardHandler dinoKeyboardHandler = new DinoKeyboardHandler(pic);
        Keyboard keyboard = new Keyboard(dinoKeyboardHandler);
        keyboard.addEventListener(38, KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(38, KeyboardEventType.KEY_RELEASED);
    }
}
