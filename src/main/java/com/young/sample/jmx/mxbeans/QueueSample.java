package com.young.sample.jmx.mxbeans;

import lombok.Getter;

import java.beans.ConstructorProperties;
import java.util.Date;

/**
 * Created by yangjinqiu on 7/20/16.
 */
public class QueueSample {

	@Getter
	private final Date date;
	@Getter
	private final int size;
	@Getter
	private final String head;

	@ConstructorProperties({"date", "size", "head"})
	public  QueueSample(Date date, int size, String head) {
		this.date = date;
		this.size = size;
		this.head = head;
	}
}
