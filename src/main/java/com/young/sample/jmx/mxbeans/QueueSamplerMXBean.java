package com.young.sample.jmx.mxbeans;

/**
 * Created by yangjinqiu on 7/20/16.
 */
public interface QueueSamplerMXBean {

	QueueSample getQueueSample();
	void clearQueue();

}
