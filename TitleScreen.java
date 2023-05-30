import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Jonathan 
 * @version v1
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Famished Frog", 80);
    Label startLabel = new Label("Press spacebar to start the game", 30);
    Label instructionLabel = new Label("Use A to move left and D to move right", 30);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x325 cells with a cell size of 1x1 pixels.
        super(600, 325, 1); 
        
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(instructionLabel, 300, 250);
        addObject(startLabel, 300, 220);
    }
    
    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if space bar is pressed
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
