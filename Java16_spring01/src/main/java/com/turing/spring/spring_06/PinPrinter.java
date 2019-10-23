package com.turing.spring.spring_06;

import org.springframework.stereotype.Component;

/**
 * 针式打印机
 * @author 段凌杰
 *
 */
@Component
public class PinPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("针式打印机开始打印");
	}
}
