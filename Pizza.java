 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Lactose
{
    protected Pizza()
    {
        setSpeed(6);
        GreenfootImage Image = getImage();
        Image.scale(Image.getWidth()*180/100, Image.getHeight()*180/100);
    }

    public void act()
    {
        super.act();
    }
}
