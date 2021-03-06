package neoncontrol;

import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.animation.*;
import javafx.scene.*;

public class Play{
    private Level level;
    private PhysicsEngine physics;
    private StickSpring ss;
    private Scene keyChecker;
    boolean collided = false;
    private AnimationTimer gameTimer = new AnimationTimer() {
        @Override
        public void handle(long l) {
            collided = false;
            ss.getHB1().setY(ss.getHB1().getY() + ss.getVelocityVec().getY());
            ss.getHB1().setX(ss.getHB1().getX() + ss.getVelocityVec().getX());
            ss.getHB2().setY(ss.getHB2().getY() + ss.getVelocityVec().getY());
            ss.getHB2().setX(ss.getHB2().getX() + ss.getVelocityVec().getX());
            ss.getHB3().setY(ss.getHB3().getY() + ss.getVelocityVec().getY());
            ss.getHB3().setX(ss.getHB3().getX() + ss.getVelocityVec().getX());

            level.getWallList().forEach((wall) -> {
                
               if(ss.getHB2().intersects(wall.getHB().getBoundsInLocal()) && !ss.getHB1().intersects(wall.getHB().getBoundsInLocal()) && !collided){
                    ss.setVelocityVec(physics.collisionSpring(ss.getVelocityVec(), ss.getAngle() + 90));
                    collided = true;
                    EventHandler<ActionEvent> eventHandler = e -> {
                        System.out.println("count is "+count);
                        switch(count){
                            case 0: ss.setImage(new Image("Graphics/spring 5.png")); count++; break;
                            case 1: ss.setImage(new Image("Graphics/spring 6.png")); count++; break;
                            case 2: ss.setImage(new Image("Graphics/spring 7.png")); count++; break;
                            case 3: ss.setImage(new Image("Graphics/spring 6.png")); count++; break;
                            case 4: ss.setImage(new Image("Graphics/spring 5.png")); count++; break;
                            case 5: ss.setImage(new Image("Graphics/spring 1.png")); count=0; break;
                        }
                    };  
                    Timeline animation = new Timeline(new KeyFrame(Duration.millis(25), eventHandler));
                    animation.setCycleCount(6);
                    animation.play();
                }
                if(ss.getHB1().intersects(wall.getHB().getBoundsInLocal()) && !ss.getHB2().intersects(wall.getHB().getBoundsInLocal()) && !collided){
                    ss.setVelocityVec(physics.collisionSpring(ss.getVelocityVec(), ss.getAngle() + 270));
                    collided = true;
                    EventHandler<ActionEvent> eventHandler = e -> {
                        System.out.println("count is "+count);
                        switch(count){
                            case 0: ss.setImage(new Image("Graphics/spring 2.png")); count++; break;
                            case 1: ss.setImage(new Image("Graphics/spring 3.png")); count++; break;
                            case 2: ss.setImage(new Image("Graphics/spring 4.png")); count++; break;
                            case 3: ss.setImage(new Image("Graphics/spring 3.png")); count++; break;
                            case 4: ss.setImage(new Image("Graphics/spring 2.png")); count++; break;
                            case 5: ss.setImage(new Image("Graphics/spring 1.png")); count=0; break;
                        }
                    };  
                    Timeline animation = new Timeline(new KeyFrame(Duration.millis(25), eventHandler));
                    animation.setCycleCount(6);
                    animation.play();
                }
                else if(ss.getHB3().intersects(wall.getHB().getBoundsInLocal()) && !collided){
                    ss.setVelocityVec(physics.collisionSide(ss.getVelocityVec(), wall));
                    collided = true;
                }
            });
            if(!collided)
                ss.setVelocityVec(physics.calculateMove(ss.getVelocityVec()));
            
            ss.setYPos(ss.getVelocityVec().getY() + ss.getYPos());
            ss.setXPos(ss.getVelocityVec().getX() + ss.getXPos());
            
            ss.getHB1().setY(ss.getYPos() + 100);
            ss.getHB1().setX(ss.getXPos() + 9);
            ss.getHB2().setY(ss.getYPos());
            ss.getHB2().setX(ss.getXPos() + 9);
            ss.getHB3().setY(ss.getYPos() + 20);
            ss.getHB3().setX(ss.getXPos() + 9);
        }
    };

    public Play(){
        
    }
    
    public Play(Level level, PhysicsEngine physics, StickSpring ss, Scene keyChecker){
        this.level = level;
        this.physics = physics;
        this.ss = ss;
        this.keyChecker = keyChecker;
    }    
    
    public void start(){
        gameTimer.start();
        keyChecker.setOnKeyPressed((KeyEvent e) -> {
            switch (e.getCode()){
                case ESCAPE: gameTimer.stop();break;
            }
        });
    }
    
    public void showMenu(Menu menu){
        
    }

    
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
