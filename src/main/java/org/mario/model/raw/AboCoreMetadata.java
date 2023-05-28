package org.mario.model.raw;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AboCoreMetadata {
	private String country;
	private String domain_name;
	private String item_id;
	private ArrayList item_name;
	private String marketplace;
	private ArrayList product_type;
	private ArrayList brand;
	private String main_image_id;
	private ArrayList node;
	private ArrayList other_image_id;
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getDomain_name() {
		return domain_name;
	}
	
	public void setDomain_name(String domain_name) {
		this.domain_name = domain_name;
	}
	
	public String getItem_id() {
		return item_id;
	}
	
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	
	public String getMarketplace() {
		return marketplace;
	}
	
	public void setMarketplace(String marketplace) {
		this.marketplace = marketplace;
	}
	
	public String getMain_image_id() {
		return main_image_id;
	}
	
	public void setMain_image_id(String main_image_id) {
		this.main_image_id = main_image_id;
	}
	
	public ArrayList getItem_name() {
		return item_name;
	}
	
	public void setItem_name(ArrayList item_name) {
		this.item_name = item_name;
	}
	
	public ArrayList getProduct_type() {
		return product_type;
	}
	
	public void setProduct_type(ArrayList product_type) {
		this.product_type = product_type;
	}
	
	public ArrayList getBrand() {
		return brand;
	}
	
	public void setBrand(ArrayList brand) {
		this.brand = brand;
	}
	
	public ArrayList getNode() {
		return node;
	}
	
	public void setNode(ArrayList node) {
		this.node = node;
	}
	
	public ArrayList getOther_image_id() {
		return other_image_id;
	}
	
	public void setOther_image_id(ArrayList other_image_id) {
		this.other_image_id = other_image_id;
	}
}