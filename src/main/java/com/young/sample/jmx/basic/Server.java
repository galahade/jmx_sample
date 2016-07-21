package com.young.sample.jmx.basic;

import java.io.IOException;

/**
 * @author yangjinqiu@le.com
 * @Date 16/7/21
 */
public class Server {

	public static void main(String[] args) {

	}

	private static void echo(String msg) {
		System.out.println(msg);
	}

	private static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void waitForEnterPressed() {
		try {
			echo("\nPress <Enter> to continue...");
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
