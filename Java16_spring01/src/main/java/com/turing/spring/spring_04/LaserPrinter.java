package com.turing.spring.spring_04;

/**
 * 激光打印机
 * @author 段凌杰
 *
 */
public class LaserPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("激光打印机开始打印");
	}
}
