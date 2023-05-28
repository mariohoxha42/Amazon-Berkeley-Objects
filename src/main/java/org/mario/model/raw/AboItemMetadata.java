package org.mario.model.raw;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AboItemMetadata extends AboCoreMetadata {
	private Map item_dimensions;
	private ArrayList item_keywords;
	private ArrayList item_shape;
	private ArrayList item_weight;
	
	public Map getItem_dimensions() {
		return item_dimensions;
	}
	
	public void setItem_dimensions(Map item_dimensions) {
		this.item_dimensions = item_dimensions;
	}
	
	public ArrayList getItem_keywords() {
		return item_keywords;
	}
	
	public void setItem_keywords(ArrayList item_keywords) {
		this.item_keywords = item_keywords;
	}
	
	public ArrayList getItem_weight() {
		return item_weight;
	}
	
	public void setItem_weight(ArrayList item_weight) {
		this.item_weight = item_weight;
	}
	
	public ArrayList getItem_shape() {
		return item_shape;
	}
	
	public void setItem_shape(ArrayList item_shape) {
		this.item_shape = item_shape;
	}
}
