import org.hibernate.Session;

import java.util.List;

public class StudentDAO {

    public void add(Student student) {
        Session session = Session_Factory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    public void update(Student student) {
        Session session = Session_Factory.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
        session.close();
    }

    public Student getById(Integer id) {
        Session session = Session_Factory.getSessionFactory().openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }

    public void deleteById(Integer id) {
        Session session = Session_Factory.getSessionFactory().openSession();
        session.beginTransaction();
        session.createQuery("delete from Student s where id = :id", Student.class).setParameter("id",id);
    }

    public List<Student> findAll() {
        Session session = Session_Factory.getSessionFactory().openSession();
        List<Student> students = session.createQuery("From Student ").list();
        session.close();
        return students;
    }
}
