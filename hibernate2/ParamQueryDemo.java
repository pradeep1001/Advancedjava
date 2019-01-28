package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.student;

public class DeleteDemo 
{
	public static void main(String arg[])
	{
		try
		{
			Configuration config=new Configuration();
			config.configure("hibernate2.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Course a=(Course)session.load(Course.class,1002);
			
			Transaction tran=session.beginTransaction();
			session.delete(a);
			tran.commit();
			
			session.close();
			System.out.println("Delete Demo is Working");
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}
