import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        Random random = new Random();
        String[] mas = {"A", "B", "C", "D", "F"};
        for (int i = 1; i < 1001; i++) {
            studentDAO.add(new Student("Student " + i, mas[random.nextInt(5)]));
        }
    }
}
