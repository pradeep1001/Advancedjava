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
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory = new Configuration().configure(("hibernate.cfg.xml")).buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Transaction tran=session.beginTransaction();
			com.student student=new com.student();
			student.setStudentId(1002);
			student.setStudentName("Prakash");
			student.setFees(89000);
			session.save(student);
			tran.commit();
			
			System.out.println("Student Record Saved");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}