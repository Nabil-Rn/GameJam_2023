import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends World
{

    /**
     * Constructor for objects of class Credits.
     * 
     */
    public Credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        displayText();
    }
    
    public void displayText() {
        showText("Credits", 290, 110);
        showText("-----------------------------", 290, 140);
        showText("Nabil | Programming", 290, 170);
        showText("Kevin | Programming & Trolling", 290, 190);
        showText("Jason | Art", 290, 210);
        showText("Bohdan| Art", 290, 230);
    }
}
