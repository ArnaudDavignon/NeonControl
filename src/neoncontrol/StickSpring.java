/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neoncontrol;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;



/**
 *
 * @author addav
 */
public class StickSpring extends ImageView{
    private double yPos;
    private double xPos;
    private double angle = 0;
    
    private Vector velVector;
    private double mass;
    
    private Rectangle spring1HB;
    private Rectangle spring2HB;
    private Rectangle stickHB;

    public StickSpring() {
        this.setImage(new Image("Graphics/spring 1.png"));
        setPos(200,200);
    }
    
    public StickSpring(Vector velVector){
        this.velVector = velVector;
        this.setImage(new Image("Graphics/spring 1.png"));
    }

    public double getYPos() {
        return yPos;
    }

    public void setYPos(double yPos) {
        this.yPos = yPos;
        this.setY(yPos);
    }

    public double getXPos() {
        return xPos;
    }

    public void setXPos(double xPos) {
        this.xPos = xPos;
        this.setX(xPos);
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
        this.setRotate(angle);
    }

    public Vector getVelocityVec(){
        return velVector;
    }
    
    public void setVelocityVec(Vector velVector){
        this.velVector = velVector;
    }
    
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
    
    //this will need fixing
    public void rotate(){
        double currentAngle = this.getAngle();
    }
    
    public double calculateNewX(){
        double newX = getXPos()+getVelocityVec().getX();
        return newX;
    }
    
    public double calculateNewY(){
        double newY = getYPos()+getVelocityVec().getY();
        return newY;
    }
    
    public void setPos(double newXPos, double newYPos){
        this.setXPos(newXPos);
        this.setYPos(newYPos);
    }  
    
    public Rectangle getHB1() {
        return spring1HB;
    }
    
    public Rectangle getHB2() {
        return spring2HB;
    }
    
    public Rectangle getHB3() {
        return stickHB;
    }
}
