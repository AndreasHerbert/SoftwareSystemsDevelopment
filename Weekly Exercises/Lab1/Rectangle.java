public class Rectangle extends Shape{
    private int width;
    private int height;

    Rectangle(int sides) {
        super(sides);
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getArea(){
        return width * height;
    }
}
