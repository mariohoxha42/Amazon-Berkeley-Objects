package org.mario.model.raw;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AboProductMetadata extends AboCoreMetadata {
	private ArrayList bullet_point;
	private ArrayList color;
	private ArrayList color_code;
	private ArrayList fabric_type;
	private ArrayList finish_type;
	private ArrayList material;
	private ArrayList pattern;
	private ArrayList product_description;
	private ArrayList style;
	
	public ArrayList getBullet_point() {
		return bullet_point;
	}
	
	public void setBullet_point(ArrayList bullet_point) {
		this.bullet_point = bullet_point;
	}
	
	public ArrayList getColor() {
		return color;
	}
	
	public void setColor(ArrayList color) {
		this.color = color;
	}
	
	public ArrayList getMaterial() {
		return material;
	}
	
	public void setMaterial(ArrayList material) {
		this.material = material;
	}
	
	public ArrayList getStyle() {
		return style;
	}
	
	public void setStyle(ArrayList style) {
		this.style = style;
	}
	
	public ArrayList getFabric_type() {
		return fabric_type;
	}
	
	public void setFabric_type(ArrayList fabric_type) {
		this.fabric_type = fabric_type;
	}
	
	public ArrayList getProduct_description() {
		return product_description;
	}
	
	public void setProduct_description(ArrayList product_description) {
		this.product_description = product_description;
	}
	
	public ArrayList getColor_code() {
		return color_code;
	}
	
	public void setColor_code(ArrayList color_code) {
		this.color_code = color_code;
	}
	
	public ArrayList getPattern() {
		return pattern;
	}
	
	public void setPattern(ArrayList pattern) {
		this.pattern = pattern;
	}
	
	public ArrayList getFinish_type() {
		return finish_type;
	}
	
	public void setFinish_type(ArrayList finish_type) {
		this.finish_type = finish_type;
	}
}
