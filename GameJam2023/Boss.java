import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    static boolean attack1 = false;
    static boolean attack2 = false;
    static boolean attack3 = false;
    static int health = 10;
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
    
    public int attack()
    {
        int randNb = Greenfoot.getRandomNumber(100);
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            if (randNb == 0) 
            {
                //
                attack1 = true;
                return 1;
            }
            if (randNb == 1) 
            {
                //
                attack2 = true;
                return 1;
            }
            if (randNb == 2) 
            {
                //
                attack3 = true;
                return 1;
            }

        } 
            return 0;
    }
    
     public void damage()
    {
            Actor Playerhit = getOneIntersectingObject(Player.class);
            if (Playerhit != null){
                //if(){
                Player player = (Player) new Player();
                health = health - player.Attack();
                //}
            }
    }
    public static int gethealth() { //count how many sheep the Wolf ate
        return health;
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
