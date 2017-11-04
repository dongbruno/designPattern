public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }
    @Override
    public void draw(){
        System.out.print("Inside Circle::draw() method.");
    }
}
