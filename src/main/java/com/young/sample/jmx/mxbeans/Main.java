package com.young.sample.jmx.mxbeans;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by yangjinqiu on 7/20/16.
 */
public class Main {

	public static void main (String[] args) throws Exception {
		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

		ObjectName name = new ObjectName("com.young.sample.jmx.mxbeans:type=QueueSampler");

		Queue<String> queue = new ArrayBlockingQueue<>(10);

		queue.add("Request-1");
		queue.add("Request-2");
		queue.add("Request-3");

		QueueSampler mxbean = new QueueSampler(queue);

		mbs.registerMBean(mxbean, name);

		System.out.println("Waiting...");
		Thread.sleep(Long.MAX_VALUE);
	}
}
