package snippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CRUDDemo 
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("org.h2.Driver");
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1", "sa", "sa");
			
			PreparedStatement psmt=conn.prepareStatement("insert into Employee values(?,?,?,?)");
			
			int empId,salary;
			String empName,addr;
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter Employee ID:");
			empId=scanner.nextInt();
			
			System.out.println("Enter Employee Salary:");
			salary=scanner.nextInt();
			
			System.out.println("Enter Employee Name:");
			empName=scanner.next();
			
			System.out.println("Enter Employee Address:");
			addr=scanner.next();
			
			psmt.setInt(1, empId);
			psmt.setString(2,empName);
			psmt.setString(3, addr);
			psmt.setInt(4,salary);
			
			int row_eff=psmt.executeUpdate();
			
			if(row_eff>0)
				System.out.println("Row is Inserted:");
			else
				System.out.println("Row Insertion Problem:");
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}