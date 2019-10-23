package com.turing.spring.spring_06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 图文店
 * @author 段凌杰
 *
 */
/**
 * @Configuration就等于空的config.xml
 * @ComponentScan就等同于<context:component-scan>,扫描的默认值就是当前类所在的包及其子包
 * @author 段凌杰
 *
 */
@Configuration
@ComponentScan
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
		ApplicationContext ctx=new AnnotationConfigApplicationContext(PrintHouse.class);
		
		//从容器中获取打印机
		Printer printer = ctx.getBean("laserPrinter",Printer.class);
		//调用方法
		printer.print();
		
	}
}









