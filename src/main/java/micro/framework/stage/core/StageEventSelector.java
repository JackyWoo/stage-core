package micro.framework.stage.core;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author wujianchao <wuchienchao@qq.com>
 * @date Oct 9, 2015 12:30:55 PM
 */
public class StageEventSelector {
	
	private LinkedBlockingQueue<StageEvent> queue = new LinkedBlockingQueue<StageEvent>();
	
	public StageEvent select() throws InterruptedException{
		return queue.take();
	}
	
	public StageEvent select(long timeout) throws InterruptedException{
		return queue.poll(timeout, TimeUnit.MILLISECONDS);
	}
	
	public boolean addEvent(StageEvent event){
		return queue.add(event);
	}

}
