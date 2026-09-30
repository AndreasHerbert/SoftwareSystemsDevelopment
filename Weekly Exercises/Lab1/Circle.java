public class Circle extends Shape{
    private double diameter;
    private double radius;

    Circle(int sides){
        super(sides);
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
        this.radius = diameter/2;
    }

    public void setRadius(double radius){
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
