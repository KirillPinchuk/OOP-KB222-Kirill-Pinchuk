package lab_04;
import java.util.ArrayList;

class Quadrilateral extends Figure {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    Quadrilateral(Point a, Point b, Point c, Point d) {
        if (!isValidQuadrilateral(a, b, c, d)) {
            throw new IllegalArgumentException("Invalid quadrilateral vertices");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    private boolean isValidQuadrilateral(Point a, Point b, Point c, Point d) {
    	ArrayList<Point> points = new ArrayList<>();
        points.add(a);
        points.add(b);
        points.add(c);
        points.add(d);

        for (int i = 0; i < 4; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get((i + 1) % 4);
            Point p3 = points.get((i + 2) % 4);
            if (isCollinear(p1, p2, p3)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean isCollinear(Point a, Point b, Point c) {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y))) < 1e-9;
    }

    @Override
    double area() {
        double areaTriangle1 = triangleArea(a, b, c);
        double areaTriangle2 = triangleArea(c, b, d);
        return areaTriangle1 + areaTriangle2;
    }

    private double triangleArea(Point A, Point B, Point C) {
        return Math.abs((A.x*(B.y - C.y) + B.x*(C.y - A.y) + C.x*(A.y - B.y)) / 2);
    }

    @Override
    Point centroid() {
    	double centroidX = (a.x + b.x + c.x + d.x) / 4;
        double centroidY = (a.y + b.y + c.y + d.y) / 4;
        return new Point(centroidX, centroidY);
    }

    @Override
    public String toString() {
        return "Quadrilateral[A" + a + " B" + b + " C" + c + " D" + d + "]";
    }
}