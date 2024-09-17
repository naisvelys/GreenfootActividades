import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

class Projectile extends Actor
{
    /**
     * Declaraciones
     */
    
    private int direccion;
    
    public void addedToWorld(World world){
        direccion = getWorld().getObjects(Cohete.class).get(0).getRotation();
    }
    
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
        movimientoProyectil();
        quitarDelMundo();
    } 

    /**
     * Metodo preparacion de los elementos de esta Clase
     */
    private void prepare()
    {
    }

    public void movimientoProyectil()
     {
         if(direccion == 270){
         setLocation(getX(), getY()-10);
        }
         else if (direccion == 90){
         setLocation(getX(), getY()+10); 
         }
         else if (direccion == 360 || direccion == 0){
         setLocation(getX()+10, getY());   
         setRotation(90);
         }
        else if (direccion == 180){
        setLocation(getX()-10, getY());
        setRotation(180);
        }
     }
    
    public void projeyectiloMove(){
        setLocation(getX(),getY()-20);
        if(getY() == 0) {
             getWorld().removeObject(this);
        }
    }
    
    
    
    public void quitarDelMundo()
    {
      if(getY() == 0 || getX() == 0 || getX() == getWorld().getWidth()-1 || getY() == getWorld().getHeight()-1)
      {
          getWorld().removeObject(this);
      }
    }
}