package com.turing.spring.spring_03;


/**
 * 图文店
 * @author 段凌杰
 *
 */
public class PrintHouse {
	
	//依赖打印机
//	private PinPrinter pinPrinter;
//	private LaserPrinter laserPrinter;
	
	//接口的引用
	private Printer printer;

	public PrintHouse() {
		printer=new PinPrinter();
	}

	/**
	 * 提供服务
	 */
	public void service() {
//		pinPrinter=new PinPrinter();
//		pinPrinter.print();
//		laserPrinter=new LaserPrinter();
//		laserPrinter.print();
		printer.print();
	}
	
	public static void main(String[] args) {
		//创建图文店对象
		PrintHouse printHouse=new PrintHouse();
		//提供服务
		printHouse.service();
	}
}
