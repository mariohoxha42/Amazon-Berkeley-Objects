package org.mario.model.processed;

public class ProcessedModel extends ProcessedCore {
	private String model_id;
	private String model_name;
	private String model_number;
	private String model_year;
	private String spin_id;
	
	public String getModel_id() {
		return model_id;
	}
	
	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}
	
	public String getModel_name() {
		return model_name;
	}
	
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	
	public String getModel_number() {
		return model_number;
	}
	
	public void setModel_number(String model_number) {
		this.model_number = model_number;
	}
	
	public String getModel_year() {
		return model_year;
	}
	
	public void setModel_year(String model_year) {
		this.model_year = model_year;
	}
	
	public String getSpin_id() {
		return spin_id;
	}
	
	public void setSpin_id(String spin_id) {
		this.spin_id = spin_id;
	}
}
