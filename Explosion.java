import greenfoot.*;

public class Explosion extends Actor{

    private GreenfootImage[] images;
    GreenfootImage baseImage;
    int baseSize, verschil, size, action, increment;
    
    public void act() {
        images = new GreenfootImage[8];
        baseImage = new GreenfootImage("explosion.png");
        baseSize = baseImage.getWidth();
        verschil = baseSize / 8;
        size = 0;
        int teller;
        setImage(images[action]);
        action += increment;
        for(teller = 0; teller < 8; teller++) {
         size += verschil;
         images[teller] = new GreenfootImage(baseImage);
         images[teller].scale(size, size);
        }
        if(action > 7) {
         increment = -1;
         action += increment;
        }
        if(action < 0) {
         getWorld().removeObject(this);
         Greenfoot.stop();
        }
    }
}    
