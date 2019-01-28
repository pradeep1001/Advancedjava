package com;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.student;

public class CRUDDemo 
{
	public static void main(String arg[])
	{
		try
		{
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			student student=(student)session.get(student.class,1002);
			
			Transaction tran=session.beginTransaction();
			student.setStudentName("Rohan Khanna");
			session.update(student);
			tran.commit();
			
			session.close();
			
			System.out.println("Student Object is Updated");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}
