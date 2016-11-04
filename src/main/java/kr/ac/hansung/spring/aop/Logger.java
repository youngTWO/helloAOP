package kr.ac.hansung.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// log에 관련된 기능을 따로 정의(별도의 aspect)하고 runtime시에 weaving, 재사용성 증가
@Aspect
public class Logger {
	
	@Pointcut("execution(void kr.ac.hansung.spring.aop.*.sound())")
	// signature, method를 사용해서 id를 명시
	private void selectSound() { 
	}
	
	@Before("selectSound()")
	public void aboutToSound() {
		System.out.println("before: about to sound");
	}
}
