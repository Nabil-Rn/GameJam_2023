import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Entomophobia extends Actor
{
     boolean a = false;
    /**
     * Act - do whatever the Entomophobia wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if (Greenfoot.mouseMoved(this))
        {
            setImage("EntomophobiaSelect.png");
            //Greenfoot.playSound(".wav");
        }

        if (Greenfoot.mouseMoved(getWorld())  && a == false)
        {
            setImage("Entomophobia.png");
        }

        if (Greenfoot.mouseClicked(this))
        {   
            setImage("EntomophobiaSelect.png");
            // set variable to switch world
            a = !a;
        }
    }
}
