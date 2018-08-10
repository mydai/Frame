package observer.java;

import java.util.Observable;

/**
 * 
 * 
 * <b>�����ƣ�</b>Promulgator<br/>
 * <b>��������</b>�����ߣ����۲��ߣ�<br/>
 * <b>�����ˣ�</b>cuidaidai<br/>
 * <b>�޸��ˣ�</b>cuidaidai<br/>
 * <b>�޸�ʱ�䣺</b>2018��7��22�� ����10:31:37<br/>
 * <b>�޸ı�ע��</b><br/>
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
