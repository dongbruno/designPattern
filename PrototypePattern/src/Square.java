public class Square extends Shape {
    public Square(){
        type = "Square";
    }
    @Override
    public void draw(){
        System.out.print("Inside Square::draw() method.");
    }
}
