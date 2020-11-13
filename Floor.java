import greenfoot.*;

/** 
 * @author (Troy) 
 * @version (unknown)
 */
public class Floor extends World{

    public Floor(){    
        super(700, 900, 1); 
        prepare();
        redo();
    }


    private void prepare(){
        int teller;
        int X = 10;
        setPaintOrder(Counter.class, Explosion.class, Eind.class, Paddestoel.class,
        Boom.class, EmmerMan.class, Onderkant.class, Fruit.class, Bom.class,
        Steen.class);
        addObject(new EmmerMan(), 350, 740);
        addObject (new Counter(), 50, 870);
        addObject (new Steen(), 10, 740);
        addObject (new Steen(), 790, 740);
        
        for(teller = 0; teller < 8; teller ++) {
            addObject(new Boom(), Greenfoot.getRandomNumber(700),
                Greenfoot.getRandomNumber(650));
        }
        for(teller = 0; teller < 5; teller ++) {
            addObject(new Paddestoel(), Greenfoot.getRandomNumber(700),
                Greenfoot.getRandomNumber(650));
        }
        for(teller = 0; teller < 21; teller ++) {
            addObject(new Onderkant(), X,
                890);
            X += 35;
        }
    }
    private void redo(){
        int teller;
    for(teller = 0; teller < 30; teller ++) {
            addObject(new Fruit(), Greenfoot.getRandomNumber(700),
            Greenfoot.getRandomNumber(420));
        }
    for(teller = 0; teller < 10; teller ++) {
            addObject(new Bom(), Greenfoot.getRandomNumber(700),
                Greenfoot.getRandomNumber(420));
    }
    addObject (new Eind(), 350, 0);
    }
}

