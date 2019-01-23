package snippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetaDataInfo 
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("org.h2.Driver");
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1", "sa", "sa");
			Statement statement=conn.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from Employee");
			
			ResultSetMetaData rsmd=resultSet.getMetaData();
			int columnCount=rsmd.getColumnCount();
			
			for(int count=1;count<=columnCount;count++)
			{
				System.out.print(rsmd.getColumnName(count)+"\t");
			}
			
			System.out.println();
			
			while(resultSet.next())
			{
				System.out.print(resultSet.getInt(1)+"\t");
				System.out.print(resultSet.getString(2)+"\t");
				System.out.print(resultSet.getString(3)+"\t");
				System.out.println(resultSet.getInt(4));
			}
			
			statement.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		
	}

}