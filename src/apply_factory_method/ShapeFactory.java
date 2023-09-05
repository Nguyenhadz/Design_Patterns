package apply_factory_method;

public class ShapeFactory {
    public static Shape getShape(String shape) {
        switch (shape) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
