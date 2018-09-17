package spring4.aopclass.aspect.impl;

import org.springframework.stereotype.Component;

import spring4.aopclass.EatInterface;

@Component
public class DinnerImpl implements EatInterface{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dinner无参无返回eat方法被调用");
	}

	@Override
	public String eat(String name) {
		// TODO Auto-generated method stub
		System.out.println("Dinner有参有返回值eat方法被调用");
		return "Dinner有参有返回值eat";
	}

}
