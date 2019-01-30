import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Employee;

public class SpringUtil 
{
	public static void main(String arg[])
	{
		Resource resource=new ClassPathResource("SpringConfig.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Employee employee=(Employee)factory.getBean("employee");
		
		employee.display();
		
	}
}
