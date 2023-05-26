package org.mario.model.raw;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AboMetadata {
	private String country;
	private String domain_name;
	private String item_id;
	private String item_name;
	private String marketplace;
	private String product_type;
	private String brand;
	private String main_image_id;
	
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
	
	public String getItem_name() {
		return item_name;
	}
	
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	
	public String getMarketplace() {
		return marketplace;
	}
	
	public void setMarketplace(String marketplace) {
		this.marketplace = marketplace;
	}
	
	public String getProduct_type() {
		return product_type;
	}
	
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getMain_image_id() {
		return main_image_id;
	}
	
	public void setMain_image_id(String main_image_id) {
		this.main_image_id = main_image_id;
	}
}
