import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Food extends Actor
{   
    private int fallTime = 0;
    private int points = 0;
    private int speed;
    protected Food()
    {
        speed = 0;
        points = 0;
    }

    public void act() 
    {
        this.setLocation(this.getX(), this.getY() + speed);
        if (getY() >= this.getWorld().getHeight() - 10) 
        {
            this.getWorld().removeObject(this);
        }
    }

    public void setSpeed(int speed) 
    {
        this.speed = speed;
    }

    public void setPoints(int points) 
    {
        this.points = points;}

    public int getPoints() 
    {
        return points;
    }
}