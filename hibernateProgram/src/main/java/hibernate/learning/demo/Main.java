/*
 * package hibernate.learning.demo;
 * 
 * import java.util.logging.Logger;
 * 
 * import org.hibernate.Session; import org.hibernate.SessionFactory; import
 * org.hibernate.boot.registry.StandardServiceRegistryBuilder; import
 * org.hibernate.cfg.Configuration; import
 * org.hibernate.service.ServiceRegistry;
 * 
 * public class Main { private static final Logger LOGGER =
 * Logger.getLogger("Hibernate-Tutorial");
 * 
 * public static void main(String[] args) { Main main = new Main(); main.run();
 * 
 * } public void run() { SessionFactory sessionFactory=null; Session session =
 * null; try { Configuration configuration = new Configuration();
 * configuration.configure("hibernate.cfg.xml"); ServiceRegistry serviceRegistry
 * = new
 * StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
 * .build(); sessionFactory =
 * configuration.buildSessionFactory(serviceRegistry); session =
 * sessionFactory.openSession(); //persistPerson(session); }catch(Exception e) {
 * 
 * }finally{
 * 
 * } } }
 */