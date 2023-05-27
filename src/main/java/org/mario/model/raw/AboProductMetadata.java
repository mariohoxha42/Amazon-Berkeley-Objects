package org.mario.model.raw;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AboProductMetadata extends AboCoreMetadata {
	private String bullet_point;
	private String color;
	private String color_code;
	private String fabric_type;
	private String finish_type;
	private String material;
	private String pattern;
	private String product_description;
	private String style;
	
	public String getBullet_point() {
		return bullet_point;
	}
	
	public void setBullet_point(String bullet_point) {
		this.bullet_point = bullet_point;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor_code() {
		return color_code;
	}
	
	public void setColor_code(String color_code) {
		this.color_code = color_code;
	}
	
	public String getFabric_type() {
		return fabric_type;
	}
	
	public void setFabric_type(String fabric_type) {
		this.fabric_type = fabric_type;
	}
	
	public String getFinish_type() {
		return finish_type;
	}
	
	public void setFinish_type(String finish_type) {
		this.finish_type = finish_type;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getPattern() {
		return pattern;
	}
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	public String getProduct_description() {
		return product_description;
	}
	
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	
	public String getStyle() {
		return style;
	}
	
	public void setStyle(String style) {
		this.style = style;
	}
}
