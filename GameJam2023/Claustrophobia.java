// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Claustrophobia extends Actor
{
     boolean a = false;
    /**
     * Act - do whatever the Claustrophobia wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (Greenfoot.mouseMoved(this))
        {
            setImage("ClaustrophobiaSelect.png");
            //Greenfoot.playSound(".wav");
        }

        if (Greenfoot.mouseMoved(getWorld())  && a == false)
        {
            setImage("Claustrophobia.png");
        }

        if (Greenfoot.mouseClicked(this))
        {   
            setImage("ClaustrophobiaSelect.png");
            // set variable to switch world
            a = !a;
        }
    }
}
