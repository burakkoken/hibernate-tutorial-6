import Models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * Created by Burak Köken on 28.5.2017.
 */
public class HibernateTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("Burak Köken");
        employee1.setSalary(4500);
        employee1.setBirthDate(new Date());

        Employee employee2 = new Employee();
        employee2.setName("Berk Semerci");
        employee2.setSalary(5000);
        employee2.setBirthDate(new Date());

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(employee1);
        session.save(employee2);
        session.getTransaction().commit();

        session.close();

    }

}
