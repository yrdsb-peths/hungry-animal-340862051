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
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            move(1);
        }
        
        // Remove fly if frog eats it
        eat();
    }
    
    /**
     * Eat the fly and spawn new fly if fly is eaten
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
    }
}
