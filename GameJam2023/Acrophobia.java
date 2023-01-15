import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Acrophobia extends Actor
{
    boolean a = false;
    /**
     * Act - do whatever the Acrophobia wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("AcrophobiaSelect.png");
            //Greenfoot.playSound(".wav");
        }

        if (Greenfoot.mouseMoved(getWorld()) && a == false)
        {
            setImage("Acrophobia.png");
        }

        if (Greenfoot.mouseClicked(this))
        {   
            setImage("AcrophobiaSelect.png");
            // set variable to switch world
            a = !a;
        }

    }
}
