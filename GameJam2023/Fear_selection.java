import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Fear_selection extends World
{
    private GreenfootSound gameMenuMusic;
    /**
     * Constructor for objects of class Fear_selection.
     */
    public Fear_selection()
    {
        super(600, 400, 1);
        //gameMenuMusic = new GreenfootSound("GameMenu_Faded.wav");
        prepare();
        displayText();
        //public int counter = 0;
    }
    /*
    public void started() {
        gameMenuMusic.playLoop();
    }

    public void stopped() {
        gameMenuMusic.stop();
    }
    */
   
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {

        Acrophobia acrophobia = new Acrophobia();
        addObject(acrophobia,160,144);
        Claustrophobia claustrophobia = new Claustrophobia();
        addObject(claustrophobia,160,207);
        Entomophobia entomophobia = new Entomophobia();
        addObject(entomophobia,160,282);
        Nyctophobia nyctophobia = new Nyctophobia();
        addObject(nyctophobia,380,139);
        Ophidiophobia ophidiophobia = new Ophidiophobia();
        addObject(ophidiophobia,380,285);
        Trypanophobia trypanophobia = new Trypanophobia();
        addObject(trypanophobia,380,215);
    }
    
    public void displayText() {
        showText("Choose 3 fears", 290, 90);
    }
}
