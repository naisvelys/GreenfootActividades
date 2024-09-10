import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

class Projectile extends Actor
{
    /**
     * Declaraciones
     */
    /**
     * Constructor
     */
    public Projectile()
    {
    }

    /**
     * Metodos getter and setters
     */
    /**
     * Metodos Action que se ejecuta siempre que el objeto exista
     */
    public void act() 
    {
        projectileMove();
        removeFromWorld();
    } 

    /**
     * Metodo preparacion de los elementos de esta Clase
     */
    private void prepare()
    {
    }

    /**
     * Metodos de Projectile completos y con elementos completos no estandares.
     */

    public void projectileMove()
    {
        setLocation(getX(), getY() - 10);
    }

    public void removeFromWorld()
    {
        if(getY() == 0)
        {
            getWorld().removeObject(this);
        }
    }

}