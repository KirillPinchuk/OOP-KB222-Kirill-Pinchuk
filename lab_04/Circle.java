package lab_04;

class Circle extends Figure {
    private Point center;
    private double radius;

    Circle(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid radius");
        }
        this.center = center;
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    Point centroid() {
        return center;
    }

    @Override
    public String toString() {
        return "Circle[" + center + " Radius " + radius + "]";
    }
}