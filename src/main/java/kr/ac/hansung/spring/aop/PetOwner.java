package kr.ac.hansung.spring.aop;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	
	/*
	@Autowired // Wiring by type
	@Qualifier(value="qf_dog")
	*/
	
	@Resource(name="dog") // Wiring by name
	private AnimalType animal;
	
	public void play() {
		animal.sound();
	}
}
