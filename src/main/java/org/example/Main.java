class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}


class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0 ||
                sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle(5, 10);
            System.out.println("Прямоугольник: Площадь = " + rectangle.getArea() + ", Периметр = " + rectangle.getPerimeter());
            Circle circle = new Circle(7);
            System.out.println("Круг: Площадь = " + circle.getArea() + ", Периметр = " + circle.getPerimeter());
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Треугольник: Площадь = " + triangle.getArea() + ", Периметр = " + triangle.getPerimeter());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
