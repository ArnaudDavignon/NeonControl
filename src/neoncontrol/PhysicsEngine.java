package neoncontrol;
//Joshua Morency
public class PhysicsEngine {
    private final double GRAVITY;
    
    public PhysicsEngine(double weight){
        GRAVITY = weight;
    }
    
    public Vector collisionSide(Vector v, Wall wall){
        return new Vector(v.add(wall.getNormal().multiplyConstant((v.dot(wall.getNormal())) * -2)));
    }
    
    public Vector collisionSpring(Vector v, double angle){
        double x, y;
        x = Math.sqrt((v.getX() * v.getX()) + (v.getY() * v.getY())) * Math.cos(angle);
        y = Math.sqrt((v.getX() * v.getX()) + (v.getY() * v.getY())) * Math.sin(angle);
        return new Vector(x, y);
    }
    
    public Vector calculateMove(Vector v){
        return v.add(new Vector(0, GRAVITY));
    }
}
