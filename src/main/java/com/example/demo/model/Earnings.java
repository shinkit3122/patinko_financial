package com.example.demo.model;

import java.time.LocalDate;

public class Earnings {
    private int id;
    private LocalDate date;
    private String shop;
    private int investment;
    private int returnMoney;
    private String memo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate localDate) {
		this.date = localDate;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	public int getInvestment() {
		return investment;
	}
	public void setInvestment(int investment) {
		this.investment = investment;
	}
	public int getReturnMoney() {
		return returnMoney;
	}
	public void setReturnMoney(int returnMoney) {
		this.returnMoney = returnMoney;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

    
}