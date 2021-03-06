package micro.framework.stage.core;

/**
 *
 * @author wujianchao <wuchienchao@qq.com>
 * @date Oct 9, 2015 12:27:11 PM
 */
public interface Stagable {
	
	StageEvent nextStage(String eventType);
	
	String id();
	
	StageEventSelector selector();
}
