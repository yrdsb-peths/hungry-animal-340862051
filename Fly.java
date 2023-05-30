import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for the frog.
 * 
 * @author  Jonathan 
 * @version v1
 */
public class Fly extends Actor
{
    /**
     * Act - do whatever the Fly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setRotation(90);
        setLocation(getX(), getY() + 1);
        
        // Remove fly and draw game over when fly hits the floor
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
