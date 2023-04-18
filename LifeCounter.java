import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A simple counter
 * 
 * @author 
 * @version
 */
public class LifeCounter extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int lactose;
    private int target;

    /**
     * Create a new counter, initialised to 0.
     */

    public LifeCounter()
    { 
        GreenfootImage Image = getImage();
        Image.scale(Image.getWidth()*50/100,Image.getHeight()*50/100);
        background = getImage();  
        lactose = 9;
        updateImage();
        target = 9;
    }

    /**
     * Animate the display to count up (or down) to the current target value.
     */
    public void act() 
    {
        if (lactose < target) 
        {
            lactose--;
            updateImage();
        }

        else if (lactose > target)
        {
            lactose--;
            updateImage();
        }
    }

    /**
     * Add a new score to the current counter value.
     */
    public void add(int score)
    {
        target += score;
    }

    /**
     * Return the current counter value.
     */
    public int getLactose()
    {
        return lactose;
    }

    /**
     * Set a new counter value.
     */
    public void setLactose(int newLactose)
    {
        target = newLactose;
        lactose = newLactose;
        updateImage();
    }

    /**
     * Update the image on screen to show the current value.
     */
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage("" + lactose, 42, Color.WHITE, transparent);
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
            (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
