import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A simple counter 
 *
 */

public class Counter extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int points;
    private int target;   
    /**
     * Create a new counter, initialised to 0.
     */

    public Counter()
    { 
        GreenfootImage Image = getImage();
        Image.scale(Image.getWidth()*40/100,Image.getHeight()*40/100);
        background = getImage();  
        points = 0;
        target = 0;
        updateImage();
    }

    /**
     * Animate the display to count up (or down) to the current target value.
     */

    public void act() 
    {
        if (points < target) {
            points++;
            updateImage();
        }

        else if (points > target) {
            points--;
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

    public int getPoints()
    {
        return points;
    }

    /**
     * Set a new counter value.
     */

    public void setPoints(int newPoints)
    {
        target = newPoints;
        points = newPoints;
        updateImage();
    }

    /**
     * Update the image on screen to show the current value.
     */

    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage("" + points, 42, Color.BLACK, transparent);
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
            (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
