package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.student;

public class QueryDemo 
{
	public static void main(String arg[])
	{
		try
		{
			Configuration config=new Configuration();
			config.configure("hibernate2.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Query query=session.createQuery("from Course");
			List<Course> listStudents=query.list();
			
			for(Course student:listStudents)
			{
				System.out.println(student.getCourseId()+"\t"+student.getCourseName()+"\t"+student.getDurationInMonth());
			}
			session.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}
