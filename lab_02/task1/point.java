package lab_02.task1;

public class point {
	double x;
    double y;
    
    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}