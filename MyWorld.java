import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World where the frog lives.
 * 
 * @author Jonathan 
 * @version v1
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x325 cells with a cell size of 1x1 pixels.
        super(600, 325, 1, false);
        
        // Create the frog object
        Frog frog = new Frog();
        addObject(frog, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 20, 25);
        
        
        createFly();
        createSnake();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game over ", 100);
        addObject(gameOverLabel, 300, 150);
        
    }
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    /**
     * Decrease score
     */
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);
        
    }
    /**
     * Create a new fly at random location at top of screen
     */
    public void createFly()
    {
        Fly fly = new Fly();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(fly, x, y);
    }
    /**
     * Create a new snake at random location at top of screen
     */
    public void createSnake()
    {
        Snake snake = new Snake();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(snake, x, y);
    }
}
