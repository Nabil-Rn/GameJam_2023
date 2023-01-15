import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    static boolean defendA = false;
    static boolean defendS = false;
    static boolean defendD = false;
    static int health = 10;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Attack();
        movement();
    }
    
    public static int Attack() {
                if (Greenfoot.isKeyDown("q")){
                    //left hook - chance 30% - 1 dmage
                    return 1;
                }
                if (Greenfoot.isKeyDown("w")){
                    // tap jab - chance 30% - 2 dmage
                    return 2;                                 
                    // holde charge attack - chance 30% - 3 dmage
                }
                if (Greenfoot.isKeyDown("e")){
                    //right hook - chance 30% - 1 dmage
                    return 1;
                }
                return 1;
    }
    
     public void movement() {
                if (Greenfoot.isKeyDown("a")){
                    // block w
                    defendA = true;
                }
                if (Greenfoot.isKeyDown("s")){
                    // block q and e
                    defendA = true;
                }
                if (Greenfoot.isKeyDown("d")){
                    // block w
                    defendA = true;
                }
                if (!Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("s") && !Greenfoot.isKeyDown("d")){
                    defendA = false;
                    defendS = false;
                    defendD = false;
                }
    }
    
    public static int gethealth(){
        return health;
        
    }
}
