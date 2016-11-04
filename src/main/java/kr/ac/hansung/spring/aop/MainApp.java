package kr.ac.hansung.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("kr/ac/hansung/spring/aop/beans/animal.xml");
	
		// id가 petOwner인 bean을 person에 넣어준다.
		PetOwner person = (PetOwner)context.getBean("petOwner");
		person.play();
		
		context.close();
	}
}
