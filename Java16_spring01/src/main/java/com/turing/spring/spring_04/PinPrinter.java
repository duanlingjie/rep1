package com.turing.spring.spring_04;

/**
 * 针式打印机
 * @author 段凌杰
 *
 */
public class PinPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("针式打印机开始打印");
	}
}
