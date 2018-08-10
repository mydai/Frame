package observer.java;

import java.util.Observable;

/**
 * 
 * 
 * <b>类名称：</b>Promulgator<br/>
 * <b>类描述：</b>发布者（被观察者）<br/>
 * <b>创建人：</b>cuidaidai<br/>
 * <b>修改人：</b>cuidaidai<br/>
 * <b>修改时间：</b>2018年7月22日 上午10:31:37<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0.0<br/>
 *
 */
public class Promulgator extends Observable{

	private int data = 0;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		
		if(this.data != data){
			this.data = data;
			this.setChanged();
		}
	}
	
}
