package driver;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class client {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("resource/Spring.xml");
		BeanFactory factory = new XmlBeanFactory( r);
		Test t = (Test) factory.getBean("test");
		Test t1 = (Test) factory.getBean("test");
		t.helloWorld();
	}

}
