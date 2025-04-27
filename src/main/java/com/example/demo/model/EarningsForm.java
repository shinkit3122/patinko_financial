package com.example.demo.model;

public class EarningsForm {
	private CharSequence date;
    private String shop;
    private int investment;
    private int returnMoney;
    private String memo;

    // --- Getter & Setter ---
    public CharSequence getDate() {
        return date;
    }
    public void setDate(CharSequence date) {
        this.date = date;
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
