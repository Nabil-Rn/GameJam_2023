import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Attack();
        movement();
    }
    
    public void Attack() {
                if (Greenfoot.isKeyDown("q")){
                    //left hook - chance 30% - 1 dmage
                    
                }
                if (Greenfoot.isKeyDown("w")){
                    // tap jab - chance 30% - 2 dmage
                    
                    
                    // holde charge attack - chance 30% - 3 dmage
                }
                if (Greenfoot.isKeyDown("e")){
                    //right hook - chance 30% - 1 dmage
                    
                }
    }
    
     public void movement() {
                if (Greenfoot.isKeyDown("a")){
                    // block w
                }
                if (Greenfoot.isKeyDown("s")){
                    // block q and e
                }
                if (Greenfoot.isKeyDown("d")){
                    // block w
                }
    }
}
