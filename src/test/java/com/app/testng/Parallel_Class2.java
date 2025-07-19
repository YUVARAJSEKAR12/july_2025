package com.app.testng;

import org.testng.annotations.Test;

public class Parallel_Class2 {
	@Test
	public void test4() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test4");
	}

	@Test
	public void test5() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test5");
	}

	@Test
	public void test6() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test6");
	}
}
