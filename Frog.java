import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Frog, main character of the game
 * 
 * @author Jonathan 
 * @version 1
 */
public class Frog extends Actor
{
    GreenfootSound frogSound = new GreenfootSound("Frog-sound.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[5];
    GreenfootImage[] idleLeft = new GreenfootImage[5];
    
    // Direction the frog is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor - The code that gets run one time when object is created
     */
    
    public Frog()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/frog_idle/idle" + i + ".png");
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/frog_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
        }
        
        animationTimer.mark();
        
        //initial frog image
        setImage(idleRight[0]);
    }
    
    /**
     * Animate the frog
     */
    int imageIndex = 0;
    public void animateFrog()
    {
        if(animationTimer. millisElapsed() < 300)
        {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
        setImage(idleRight[imageIndex]);
        imageIndex = (imageIndex + 1) % idleRight.length;    
        }
        else
        {
        setImage(idleLeft[imageIndex]);
        imageIndex = (imageIndex + 1) % idleLeft.length; 
        }

    
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    }

    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a"))
        {
            move(-2);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            move(2);
            facing = "right";
        }
        
        // Remove fly/snake if frog eats it
        eat();
        
        // Animate the frog
        animateFrog();
    }
    
    /**
     * Eat the fly/snake and spawns a new fly/snake
     */
    public void eat()
    {
        if(isTouching(Fly.class))
        {
            removeTouching(Fly.class);
            MyWorld world = (MyWorld) getWorld();
            world.createFly();
            world.increaseScore();
            frogSound.play();
        }
        if(isTouching(Snake.class))
        {
            removeTouching(Snake.class);
            MyWorld world = (MyWorld) getWorld();
            world.createSnake();
            world.decreaseScore();
            frogSound.play();
        }
        
    }
}
