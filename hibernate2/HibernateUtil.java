// always remember ,  if you want to add a row with studentId = 1001 , delete that row in the h2 database and then execute this file ;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HibernateUtil 
{
	public static void main(String arg[])
	{
		try
		{
			Configuration config=new Configuration();
			config.configure("hibernate2.cfg.xml");
			
			SessionFactory sessionFactory = new Configuration().configure(("hibernate2.cfg.xml")).buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Transaction tran=session.beginTransaction();
			com.Course c=new com.Course();
			c.setCourseId(1002);
			c.setCourseName("biology");
			c.setDurationInMonth(10);
			session.save(c);
			tran.commit();
			
			System.out.println("Student Record Saved");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}