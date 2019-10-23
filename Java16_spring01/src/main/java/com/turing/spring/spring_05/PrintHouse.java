package com.turing.spring.spring_05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 图文店
 * @author 段凌杰
 *
 */
@Component
public class PrintHouse {
	
	
	//接口的引用
	private Printer printer;
	
	/**
	 * 提供服务
	 */
	public void service() {
		printer.print();
	}
	
	public static void main(String[] args) {
		//获取Spring容器对象
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/turing/spring/spring_05/config.xml");
		
		//从容器中获取打印机
		Printer printer = ctx.getBean("laserPrinter",Printer.class);
		//调用方法
		printer.print();
		
	}
}









