package descriptors;

/**
 * Created by yangjinqiu on 7/20/16.
 */

@Author("Mr Bean")
@Version("1.0")
public interface QueueSamplerMXBean {

	@DisplayName("GETTER: QueueSample")
	QueueSample getQueueSample();
	@DisplayName("OPERATION: clearQueue")
	void clearQueue();

}
