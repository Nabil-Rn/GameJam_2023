import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Trypanophobia extends Actor
{
     boolean a = false;
    /**
     * Act - do whatever the Trypanophobia wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("TrypanophobiaSelect.png");
            //Greenfoot.playSound(".wav");
        }

        if (Greenfoot.mouseMoved(getWorld())  && a == false)
        {
            setImage("Trypanophobia.png");
        }

        if (Greenfoot.mouseClicked(this))
        {   
            setImage("TrypanophobiaSelect.png");
            // set variable to switch world
            a = !a;
            //if( a == true){
             //   counter ++;
            //}
        }
    }
}
