package micro.framework.stage.core;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wujianchao <wuchienchao@qq.com>
 * @date Oct 9, 2015 12:26:31 PM
 */
public class StageEvent {
	
	private String eventType;
	
	private Stagable source;
	
	private StageEventSelector selector;
	
	private Map<String, Object> context = new HashMap<String, Object>();
	
	public StageEvent(Stagable source, String eventType){
		this.source = source;
		this.eventType = eventType;
	}
	
	public StageEvent(Stagable source, String eventType, StageEventSelector selector){
		this.source = source;
		this.eventType = eventType;
		this.selector = selector;
	}

	public String getEventType() {
		return eventType;
	}

	public Stagable getSource() {
		return source;
	}

	public StageEventSelector getSelector() {
		return selector;
	}

	public void setSelector(StageEventSelector selector) {
		this.selector = selector;
	}
	
	public Map<String, Object> getContext(){
		return context;
	}
	
	public void addContext(String key, Object value){
		context.put(key, value);
	}

}
