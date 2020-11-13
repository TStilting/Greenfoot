import greenfoot.*;
import java.util.List;

public class EmmerMan extends Actor
{

    public void act(){
      movingAndTurning();
      collectingFruit();
      foundBomb();
    }
    
    protected void collectingFruit(){
    World world;
    Actor fruit;
    Counter counter;
    List lijst;
    fruit = getOneObjectAtOffset(0, 0, Fruit.class);
    if(fruit != null) {
    world = getWorld();
    world.removeObject(fruit);
    lijst = world.getObjects(Counter.class);
    counter = (Counter)lijst.get(0);
    counter.addScore();
    }
    }
    protected void movingAndTurning(){
     if(Greenfoot.isKeyDown("left")) {
       setRotation(0);
       move(-5);
       if(foundRock()) {
       move(5);
       }
     }
     if(Greenfoot.isKeyDown("right")) {
       setRotation(0);
       move(5);
       if(foundRock()) {
       move(-5);
       }
     }    
    }
    boolean foundRock() {
     Actor rock;
     rock = getOneObjectAtOffset(0, 0, Steen.class);
      if(rock != null) {
        return true;
      }
     return false;
    }
    public void foundBomb() {
    Actor bomb;
    bomb = getOneObjectAtOffset(0, 0, Bom.class);
     if(bomb != null) {
      getWorld().removeObject(bomb);
      getWorld().addObject(new Explosion(), getX(), getY());
      getWorld().removeObject(this);
      Greenfoot.stop();
     }
    }
}
