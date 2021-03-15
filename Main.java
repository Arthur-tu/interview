import Task1.Person;
import Task3.Circle;
import Task3.Square;
import Task3.Triangle;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person.PersonBuilder("f1name", "f2name","f3name").
                address("Malaya Bronnaya 1").
                age(31).
                country("Russia").
                build();

        Circle circle = new Circle(5.0);
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(5.0,5.0,5.0);
        System.out.println("S circle = " + circle.getSquare());
        System.out.println("S square = " + square.getSquare());
        System.out.println("S triangle = " + triangle.getSquare());
    }
}
