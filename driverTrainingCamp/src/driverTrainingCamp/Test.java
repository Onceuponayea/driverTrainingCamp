package driverTrainingCamp;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext conf=new ClassPathXmlApplicationContext("applicationContext.xml");
		DefaultSqlSessionFactory defaultSqlSession= (DefaultSqlSessionFactory) conf.getBean("sessionFactoryBean");
		SqlSession sqlSession=defaultSqlSession.openSession();
		String [] str=conf.getBeanDefinitionNames();
		for (String string : str) {
			System.out.println(string);
		}
		System.out.println(sqlSession.getConnection());
	
	}
}
