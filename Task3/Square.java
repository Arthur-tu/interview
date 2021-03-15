package Task3;

public class Square extends Figures {
    double x;

    public Square(double x) {
        this.x = x;
    }

    @Override
    public double getSquare() {
        return x*x;
    }
}
