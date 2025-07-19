package com.app.testng;

import org.testng.annotations.Test;

public class Parallel_Class1 {

	@Test
	public void test1() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test2");
	}

	@Test
	public void test3() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test3");
	}
}
