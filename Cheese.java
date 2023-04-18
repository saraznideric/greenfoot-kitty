import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends Lactose
{
    protected Cheese(){
        setSpeed(4);
    }

    public void act()
    {
        turn(8);
        super.act();
    }
}

