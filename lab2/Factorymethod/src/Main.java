public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("circle");
        Shape rectangle = factory.createShape("rectangle");

        circle.draw();      
        rectangle.draw();  
    }
}
