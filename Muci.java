
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class Muci je main character. 
 * @
 */
public class Muci extends Actor
{
    private int speed = 5;
    private Counter counter;
    private LifeCounter lifeCounter;
    private int imageTimer;
    private int span;
    private int imgCt;
    public Muci(Counter pointCounter, LifeCounter life)
    {
        GreenfootImage Image = getImage();
        Image.scale(Image.getWidth()/3, Image.getHeight()/3);
        counter = pointCounter;
        lifeCounter = life;

    }

    public void act() 
    {
        checkKeys();
        eat();

    }

    public void eat()
    {
        if (isTouching(Food.class))
        {
            Food food = (Food) this.getOneIntersectingObject(Food.class);
            MyWorld World = (MyWorld)getWorld();
            World.removeObject(food);
            if (food instanceof Lactose)
            {
                counter.add(-1);
                lifeCounter.add(-1);
            }
            else if (food instanceof Lactosefree)
            {
                counter.add(2);
            }
            if (counter.getPoints() >= 80)
            {
                gameOver();
            }
        }
    }

    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-5);
            int span = 4;
            int imgCt=3;
            imageTimer++;
            if (imageTimer == span)
            {
                setImage ("Run2.png");
                GreenfootImage Image = getImage();
                Image.scale(Image.getWidth()/3, Image.getHeight()/3);
            }
            if (imageTimer == 2*span)
            {
                setImage ("Run3.png");
                GreenfootImage Image = getImage();Image.scale(Image.getWidth()/3, Image.getHeight()/3);
            }
            if (imageTimer == 3 * span)
            {
                setImage ("Run4.png");
                GreenfootImage Image = getImage();
                Image.scale(Image.getWidth()/3, Image.getHeight()/3);
                imageTimer = 0;
            }
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(5);
            int span = 4;
            int imgCt = 3;
            imageTimer++;
            if (imageTimer == span)
            {
                setImage ("Run2.png");
                GreenfootImage Image = getImage();
                Image.scale(Image.getWidth()/3, Image.getHeight()/3);
            }
            if (imageTimer == 2*span)
            {
                setImage("Run3.png");
                GreenfootImage Image = getImage();
                Image.scale(Image.getWidth()/3, Image.getHeight()/3);
            }
            if (imageTimer == 3 * span)
            {
                setImage ("Run1.png");
                GreenfootImage Image = getImage();
                Image.scale(Image.getWidth()/3, Image.getHeight()/3);
                imageTimer = 0;
            }
            else
            {

            }
        }
        if (counter.getPoints() >= 15)
        {
            gameOver();
            World world = getWorld();
            world.addObject(new GameOver(), world.getWidth()/2, world.getHeight()/10);
            setImage("Slide1.png");
            setLocation(685,500);
        }
        if (lifeCounter.getLactose() <= 0)
        {
            gameOver();
            World world = getWorld();
            world.addObject(new CopyOfGameOver(), world.getWidth()/2, world.getHeight()/10);     
            setImage("Dead1.png");
            setLocation(690,570);
        }
    }

    public void gameOver()
    {
        Greenfoot.stop();
    }
}

