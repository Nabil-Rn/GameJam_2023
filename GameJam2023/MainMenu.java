import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MainMenu()
    {
        super(130, 215, 1);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,63,36);
        Credit credit = new Credit();
        addObject(credit,69,104);
    }
}
