import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Session_Factory {

    public static SessionFactory getSessionFactory() {
        return  new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }
}
