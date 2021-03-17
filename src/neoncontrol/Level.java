/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neoncontrol;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 *
 * @author addav
 */
public class Level extends ImageView{
    private ArrayList<Wall> wallList = new ArrayList<Wall>();
   

    public Level() {
        setBorders();
        this.setImage(new Image("Graphics/background level.jpg"));
    }

    public Level(ArrayList<Wall> wallList, Image background) {
        this.wallList = wallList;
        setImage(background);
        setBorders();
    }
    
    public void setWallList(ArrayList<Wall> wallList){
        this.wallList = wallList;
    }
    
    public void setBackground(Image background){
        setImage(background);
    }
    
    public void addWall(Wall w){
        wallList.add(w);
    }

    public ArrayList<Wall> getWallList() {
        return wallList;
    }

    public Image getBackground() {
        return this.getImage();
    }
    
    public Wall getWall(int index){
        return wallList.get(index);
    }
    
    private void setBorders(){
        addWall(new Wall(-10,-100,75,900,0));
        addWall(new Wall(1215,-100,75,900,0));
        addWall(new Wall(-110,-10,1500,75,0));
        addWall(new Wall(-110,630,1500,75,0));
    }
}
