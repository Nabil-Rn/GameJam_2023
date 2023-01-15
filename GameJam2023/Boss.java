import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    public Boss(){
        int health = 100;
    
    }
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        attack();
        damage();
        transitionToGameOver();
    }
    
    public void attack()
    {
        int randNb = Greenfoot.getRandomNumber(100);
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            if (randNb == 0) 
            {
                //
            }
            if (randNb == 1) 
            {
                //
            }
            if (randNb == 2) 
            {
                //
            }

        }
    }
     public void damage()
    {
            Actor Playerhit = getOneIntersectingObject(Player.class);
            if (Playerhit != null){
                
            }
    }
    
    public void transitionToGameOver()
    {
        World currentLevel = getWorld();
        currentLevel.stopped();
        //World gameOverWorld =  new GameOverWorld();
        //gameOverWorld.started();
        //Greenfoot.setWorld(gameOverWorld);
    }
}
