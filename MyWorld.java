import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World where the frog lives.
 * 
 * @author Jonathan 
 * @version v1
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Frog frog = new Frog();
        addObject(frog, 300, 200);
        
        Fly fly = new Fly();
        addObject(fly, 300, 0);
    }
}
