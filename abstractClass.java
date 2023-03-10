abstract class Shape {
    double dim1, dim2;

    Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    abstract double area();
}

class Rectangle extends Shape {
    Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    double area() {
        System.out.println("Area of rectangle: ");
        return dim1 * dim2;
    }

}

class Triangle extends Shape {
    Triangle(double d1, double d2) {
        super(d1, d2);
    }

    double area() {
        System.out.println("Area of triangle: ");
        return 0.5 * dim1 * dim2;
    }

}

class abstractClass {
    public static void main(String[] args) {
        Shape s1;
        Rectangle r1 = new Rectangle(5.5, 8.0);
        s1 = r1;
        System.out.println(s1.area());
        Triangle t1 = new Triangle(2.0, 6.3);
        s1 = t1;
        System.out.println(s1.area());

    }
}