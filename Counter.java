import greenfoot.*;


public class Counter extends Actor{
    
    int score = 0;
    
    public void act(){    
     this.setImage(new GreenfootImage("" + score, 30, Color.RED, Color.BLACK));
    }
    public void addScore(){
     score++;
     updateImage();
    }
    protected void updateImage(){
     String scoreText;
     scoreText = "Aantal diamanten: " + score;
    }
    public int getScore() {
     return score;
    }
    
}
