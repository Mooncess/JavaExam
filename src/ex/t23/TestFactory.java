package ex.t23;

public class TestFactory {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape(ShapeType.CIRCLE, 5,5,10,0);
        Shape rectangle = factory.createShape(ShapeType.RECTANGLE, 1,1,2,5);

        System.out.println("Площадь Ф1 (круга): " + circle.getArea());
        System.out.println("Площадь Ф2 (прямоугольника): " + rectangle.getArea());
    }
}
