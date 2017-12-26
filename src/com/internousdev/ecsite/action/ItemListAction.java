package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class ItemListAction extends ActionSupport implements SessionAware{

	private int id;
	private String itemName;
	private String itemPrice;

	public String execute() {
		return SUCCESS;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}



	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}