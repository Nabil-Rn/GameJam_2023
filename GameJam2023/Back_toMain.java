import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back_toMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back_toMain extends Actor
{
    /**
     * Act - do whatever the Back_toMain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this))
        {
            setImage(".png");
            //Greenfoot.playSound(".wav");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage(".png");
        }

        if (Greenfoot.mouseClicked(this))
        {   
            World currentWorld = getWorld();
            currentWorld.stopped();
            World select =  new MainMenu();
            Greenfoot.setWorld(select);
            select.started();
        }
    }
}
