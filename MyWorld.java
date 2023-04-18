import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(1200, 800, 1); 
        prepare();
    }

    private void prepare()
    {   Counter counter = new Counter();
        addObject(counter,1137, 54); 

        LifeCounter lifeCounter = new LifeCounter();
        addObject(lifeCounter,1140,159);

        Muci Muci = new Muci(counter, lifeCounter);
        addObject(Muci,300,700);
    }    

    public void act()
    {
        if (Greenfoot.getRandomNumber(1000) < 5) 
        { 
            this.addObject(new Cheese(), Greenfoot.getRandomNumber(900), 40);
        }
        if (Greenfoot.getRandomNumber(1000) < 5) 
        { 
            this.addObject(new Pizza(), Greenfoot.getRandomNumber(900), 40);
        }
        if (Greenfoot.getRandomNumber(1000) < 5)
        { 
            this.addObject(new Berry(), Greenfoot.getRandomNumber(900), 40);
        }
        if (Greenfoot.getRandomNumber(1000) < 5) 
        {
            this.addObject(new Banana(), Greenfoot.getRandomNumber(900), 40);
        }
        if (Greenfoot.getRandomNumber(1000) < 5) 
        {
            this.addObject(new Milk(), Greenfoot.getRandomNumber(900), 40);
        }
    }
}
