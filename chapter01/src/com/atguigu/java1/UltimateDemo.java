package com.atguigu.java1;

/**
 * Function: 		A {@code UltimateDemo} object With Some FUNCTION.<br/>
 * Reason:   		ADD REASON.<br/>
 * Date:            2021-01-14 22:35<br/>
 * <p>
 * Class Name:      UltimateDemo<br/>
 * Package Name:    com.atguigu.java1<br/>
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class UltimateDemo implements Runnable {
	
	private int num = 1;
	public final String info = "atguigu";
	boolean[] counts;
	
	public UltimateDemo() {
	
	}
	
	public UltimateDemo(int count) {
		this.counts = new boolean[count];
	}
	
	public String getInfo() {
		return info;
	}
	
	public void addNum(int n) {
		num += n;
		System.out.println(num);
	}
	
	@Override
	public void run() {
	
	}
	
}
