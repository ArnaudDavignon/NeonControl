/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neoncontrol;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 *
 * @author jakot
 */
public class Wall extends ImageView{
    
    private double xPos, yPos, angle, xSize, ySize;
    
    
    public Wall(){
        setImage(new Image("Graphics/wall.png"));
    }
    
    public Wall(double xPos, double yPos, double xSize, double ySize, double angle){
        setXPos(xPos);
        setYPos(yPos);
        setXSize(xSize);
        setYSize(ySize);
        setAngle(angle);
        setImage(new Image("Graphics/wall.png"));
    }

    public double getXPos() {
        return xPos;
    }

    public void setXPos(double xPos) {
        this.xPos = xPos;
        this.setX(xPos);
    }

    public double getYPos() {
        return yPos;
    }

    public void setYPos(double yPos) {
        this.yPos = yPos;
        this.setY(yPos);
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
        this.setRotate(angle);
    }


    public double getXSize() {
        return xSize;
    }

    public void setXSize(double xSize) {
        this.xSize = xSize;
        this.setFitWidth(xSize);
    }

    public double getYSize() {
        return ySize;
    }

    public void setYSize(double ySize) {
        this.ySize = ySize;
        this.setFitHeight(ySize);
    }
    
    public void setPos(double newXPos, double newYPos){
        setXPos(newXPos);
        setYPos(newYPos);
       
    }
    
    public Vector getNormal(){
        return new Vector();
    }
    
}
