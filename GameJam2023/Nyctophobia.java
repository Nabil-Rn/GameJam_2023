// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Nyctophobia extends Actor
{
     boolean a = false;
    /**
     * Act - do whatever the Nyctophobia wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (Greenfoot.mouseMoved(this))
        {
            setImage("NyctophobiaSelect.png");
            //Greenfoot.playSound(".wav");
        }

        if (Greenfoot.mouseMoved(getWorld())  && a == false)
        {
            setImage("Nyctophobia.png");
        }

        if (Greenfoot.mouseClicked(this))
        {   
            setImage("NyctophobiaSelect.png");
            // set variable to switch world
            a = !a;
        }
    }
}
