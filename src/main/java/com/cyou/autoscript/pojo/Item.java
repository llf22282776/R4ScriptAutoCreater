package com.cyou.autoscript.pojo;
/**
 * 
 * 
 * �����ʾһ������е�item
 * 
 * */
public class Item {
	private int itemId;		//itemList
	private boolean isSysmMsg; //����
	private boolean isScollWorld;//�Ƿ���������Ϣ
	private int rateNum;//��Ӧ�ĸ�������
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public boolean isSysmMsg() {
		return isSysmMsg;
	}
	public void setSysmMsg(boolean isSysmMsg) {
		this.isSysmMsg = isSysmMsg;
	}
	public boolean isScollWorld() {
		return isScollWorld;
	}
	public void setScollWorld(boolean isScollWorld) {
		this.isScollWorld = isScollWorld;
	}
	public int getRateNum() {
		return rateNum;
	}
	public void setRateNum(int rateNum) {
		this.rateNum = rateNum;
	}
	
	
	
}
