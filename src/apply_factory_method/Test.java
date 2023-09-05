package apply_factory_method;

public class Test {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();

        Shape square = ShapeFactory.getShape("Square");
        square.draw();

        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
