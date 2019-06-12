package com.hc.testgit.entity;

public class Good {
	private int id;//货号
	private String name;//商品名称
	private float price;//价格
	private int residue;//余量
	private String details;//详情
	private String producer;//生产商
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getResidue() {
		return residue;
	}
	public void setResidue(int residue) {
		this.residue = residue;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	@Override
	public String toString() {
		return "Good [id=" + id + ", name=" + name + ", price=" + price + ", residue=" + residue + ", details="
				+ details + ", producer=" + producer + "]";
	}
	
	
	public Good() {}
	public Good(int id, String name, float price, int residue, String details, String producer) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.residue = residue;
		this.details = details;
		this.producer = producer;
	}
	
	
}
