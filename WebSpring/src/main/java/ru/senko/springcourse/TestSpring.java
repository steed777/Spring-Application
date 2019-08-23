package ru.senko.springcourse;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
		"applicationContext.xml");
	
		  TestBean bean = context.getBean("bean", TestBean.class);
		  System.out.println(bean.getName());
		  
		   context.close();
}
}
