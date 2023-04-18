 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Milk extends Lactose 
{
    public Milk()
    {
        GreenfootImage Image = getImage();
        Image.scale(Image.getWidth()/30, Image.getHeight()/30);
        setSpeed(4);
    }

    public void act()
    {
        super.act();
        move(3);
        randomMove();
    }

    public void randomMove() {
        {
            if ( Greenfoot.getRandomNumber(100) < 10 )
            {
                turn( Greenfoot.getRandomNumber(40)-10 );
            }        
        }
    }
}

