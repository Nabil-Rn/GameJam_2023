import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ophidiophobia extends Actor
{
     boolean a = false;
    /**
     * Act - do whatever the Ophidiophobia wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (Greenfoot.mouseMoved(this))
        {
            setImage("OphidiophobiaSelect.png");
            //Greenfoot.playSound(".wav");
        }

        if (Greenfoot.mouseMoved(getWorld())  && a == false)
        {
            setImage("Ophidiophobia.png");
        }

        if (Greenfoot.mouseClicked(this))
        {   
            setImage("OphidiophobiaSelect.png");
            // set variable to switch world
            a = !a;
        }
    }
}
