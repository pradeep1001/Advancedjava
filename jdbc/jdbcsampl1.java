
package snippet;
import java.sql.* ;
// import java.lang.throwable;
public class jdbcsampl1  
{
 public static void main(String args[])
 {
	 try
	 {
		 Class.forName("org.h2.Driver");
		 
		 Connection conn = DriverManager.getConnection( "jdbc:h2:tcp://localhost/~/test1","sa","sa");
		 
		 Statement statement = conn.createStatement();
		 ResultSet resultSet = statement.executeQuery("select * from employee");
		 
		 while(resultSet.next())
		 {
			 System.out.print("\t"+resultSet.getInt(1));
			 System.out.print("\t"+resultSet.getString(2));
			 System.out.print("\t"+resultSet.getString(3));
			 System.out.print("\t"+resultSet.getInt(4));
			 
			 System.out.println();	
		 }
		 statement.close();
		 conn.close();
	 }
	 catch(Exception e)
	 {
		 System.out.println("Exception arised iss : "+e);
	 }
 }
}
