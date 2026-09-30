public class Main {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(4);
        Rectangle r2 = new Rectangle(4);
        Rectangle r3 = new Rectangle(4);
        Rectangle r4 = new Rectangle(4);

        r1.setWidth(2);
        r1.setHeight(4);
        System.out.println(r1.getArea());
    }
}
