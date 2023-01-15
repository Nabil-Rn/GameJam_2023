import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends Actor
{
    /**
     * Act - do whatever the Credit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("CreditsSelect.png");
            //Greenfoot.playSound(".wav");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Credits.png");
        }

        if (Greenfoot.mouseClicked(this))
        {   
            World currentWorld = getWorld();
            currentWorld.stopped();
            World select =  new Credits();
            Greenfoot.setWorld(select);
            select.started();
        }
    }
}
