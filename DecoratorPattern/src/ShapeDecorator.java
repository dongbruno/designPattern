public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    protected int test = 1;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        //decoratedShape.draw();
    }
}