package micro.framework.stage.core;

/**
 *
 * @user wujianchao Oct 9, 2015
 */
public class AbstractStageEventHandler implements StageEventHandler {

	
	private StageEvent currentEvent;
	
	private String id;
	
	private StageEventSelector selector;
	
	public AbstractStageEventHandler(String id, StageEventSelector selector){
		this.id = id;
		this.selector = selector;
	}
	
	public StageEvent nextStage(String eventType) {
		return new StageEvent(this, eventType);
	}

	public String id() {
		return id;
	}

	public StageEventSelector selector() {
		return selector;
	}

	public void run() {
		
	}

	public void stage(StageEvent event) {
		this.currentEvent = event;
	}

}
