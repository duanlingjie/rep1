package com.turing.spring.spring_02;


/**
 * 图文店
 * @author 段凌杰
 *
 */
public class PrintHouse {

	//依赖打印机
//	private PinPrinter pinPrinter;
	private LaserPrinter laserPrinter;
	
	
	/**
	 * 提供服务
	 */
	public void service() {
//		pinPrinter=new PinPrinter();
//		pinPrinter.print();
		laserPrinter=new LaserPrinter();
		laserPrinter.print();
		
	}
}
