package com.example.logoquiz;

public class Logo {
	
	private String logoName;
	private int logoResId;
	
	
	public Logo(String logoName, int logoResId){
		this.logoName = logoName;
		this.logoResId = logoResId;
	}
	
	public String getLogoName() {
		return logoName;
	}
	public void setLogoName(String logoName) {
		this.logoName = logoName;
	}
	public int getLogoResId() {
		return logoResId;
	}
	public void setLogoResId(int logoResId) {
		this.logoResId = logoResId;
	}
	
	

}
