package lab_04;

class Triangle extends Figure {
    private Point a;
    private Point b;
    private Point c;

    Triangle(Point a, Point b, Point c) {
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("Invalid triangle vertices");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isValidTriangle(Point a, Point b, Point c) {
        double ab = distance(a, b);
        double bc = distance(b, c);
        double ac = distance(a, c);
        return (ab + bc > ac) && (ab + ac > bc) && (ac + bc > ab);
    }

    private double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    @Override
    double area() {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2);
    }

    @Override
    Point centroid() {
        double x = (a.x + b.x + c.x) / 3;
        double y = (a.y + b.y + c.y) / 3;
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Triangle[A" + a + " B" + b + " C" + c + "]";
    }
}