package Task3;

public class Circle extends Figures {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getSquare() {
        return Math.PI*r*r;
    }
}
