import greenfoot.*;


public class Onderkant extends Actor{   

     public void act(){
      lookForFruit();
      lookForBom();
      eindigSpel();
     }
     protected void lookForFruit() {
      Actor fruit;
      fruit = getOneObjectAtOffset(0, 0, Fruit.class);
       if((fruit != null)) {
       getWorld().removeObject(fruit);
     }
     }
     protected void lookForBom() {
      Actor bom;
      bom = getOneObjectAtOffset(0, 0, Bom.class);
       if((bom != null)) {
       getWorld().removeObject(bom);
     }
     }
     protected void eindigSpel() {
      Actor blad;
      blad = getOneObjectAtOffset(0, 0, Eind.class);
       if((blad != null)) {
       getWorld().removeObject(blad);
        Greenfoot.stop();
       }
     }
}
