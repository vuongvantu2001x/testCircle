public class TestCircle {
    private double radius = 1.0;
    private String coler = "red";
    public final double PI = 3.14;
    TestCircle(){
    }
    TestCircle(double radius){
        this.radius = radius;
    }
    protected double getRadius() {
        return radius;
    }
    protected double getArea(){
        return PI * radius * radius;
    }
    public static void main(String[] args) {
        TestCircle circle = new TestCircle(10);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
