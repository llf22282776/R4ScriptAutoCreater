package com.cyou.autoscript.pojo;
/**
 * 
 * 
 * 本类表示一个表格中的item
 * 
 * */
public class Item {
	private int itemId;		//itemList
	private boolean isSysmMsg; //公告
	private boolean isScollWorld;//是否发生世界消息
	private int rateNum;//对应的概率数字
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
