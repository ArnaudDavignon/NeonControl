package neoncontrol;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author addav
 */
public class Play {
    private Level level;
    private PhysicsEngine physics;
    
    public Play(){
        
    }
    
    public Play(Level level, PhysicsEngine physics){
        this.level = level;
        this.physics = physics;
    }
    
    public void start(){
        //Start running the update method
    }
    
//    public void showMenu(Menu menu){
//        
//    }
    
    public void setPhysics(PhysicsEngine physics){
        this.physics = physics;
    }
    
    public void setLevel(Level level){
        this.level = level;
    }
    
    public PhysicsEngine getPhysics(){
        return physics;
    }
    
    public Level getLevel(){
        return level;
    }
    
    public void setRotateCW(StickSpring sp){
        sp.setAngle(sp.getAngle()+1);
    }
    
    public void setRotateCCW(StickSpring sp){
        sp.setAngle(sp.getAngle()-1);
    }
}
