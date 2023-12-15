package org.mario.model.raw;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AboModelMetadata extends AboCoreMetadata {
	private String model_id;
	private ArrayList model_name;
	private ArrayList model_number;
	private ArrayList model_year;
	private String spin_id;
	
	public String getModel_id() {
		return model_id;
	}
	
	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}
	
	public String getSpin_id() {
		return spin_id;
	}
	
	public void setSpin_id(String spin_id) {
		this.spin_id = spin_id;
	}
	
	public ArrayList getModel_name() {
		return model_name;
	}
	
	public void setModel_name(ArrayList model_name) {
		this.model_name = model_name;
	}
	
	public ArrayList getModel_number() {
		return model_number;
	}
	
	public void setModel_number(ArrayList model_number) {
		this.model_number = model_number;
	}
	
	public ArrayList getModel_year() {
		return model_year;
	}
	
	public void setModel_year(ArrayList model_year) {
		this.model_year = model_year;
	}
}
