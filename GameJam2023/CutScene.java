import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CutScene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CutScene extends World
{

    /**
     * Constructor for objects of class CutScene.
     * 
     */
    public CutScene()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        if (Greenfoot.mouseClicked(this))
        {   
            //World currentWorld = getWorld();
            //currentWorld.stopped();
            World select =  new CutScene();
            Greenfoot.setWorld(select);
            select.started();
        }
    }
    
    public void displayText() {
        showText("There is no game", 290, 140);
    }
}
