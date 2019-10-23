package com.turing.spring.spring_06;

import org.springframework.stereotype.Component;

/**
 * 激光打印机
 * @author 段凌杰
 *
 */
@Component
public class LaserPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("激光打印机开始打印");
	}
}