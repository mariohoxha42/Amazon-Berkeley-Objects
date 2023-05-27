package org.mario.process.transform;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.mario.model.common.AboCollection;
import org.mario.model.processed.ProcessedCore;
import org.mario.model.processed.ProcessedItem;
import org.mario.model.processed.ProcessedModel;
import org.mario.model.processed.ProcessedProduct;
import org.mario.model.raw.AboCoreMetadata;
import org.mario.model.raw.AboItemMetadata;
import org.mario.model.raw.AboModelMetadata;
import org.mario.model.raw.AboProductMetadata;

import java.util.Map;

public class Transform {
	public static void setCoreMetadata(AboCoreMetadata aboCoreMetadata, ProcessedCore processedCore) {
		if (aboCoreMetadata.getCountry() != null) {
			processedCore.setCountry(aboCoreMetadata.getCountry());
		}
		if (aboCoreMetadata.getDomain_name() != null) {
			processedCore.setDomain_name(aboCoreMetadata.getDomain_name());
		}
		if (aboCoreMetadata.getItem_id() != null) {
			processedCore.setItem_id(aboCoreMetadata.getItem_id());
		}
		if (aboCoreMetadata.getItem_name() != null) {
			processedCore.setItem_name(aboCoreMetadata.getItem_name());
		}
		if (aboCoreMetadata.getMarketplace() != null) {
			processedCore.setMarketplace(aboCoreMetadata.getMarketplace());
		}
		if (aboCoreMetadata.getProduct_type() != null) {
			processedCore.setProduct_type(aboCoreMetadata.getProduct_type());
		}
		if (aboCoreMetadata.getBrand() != null) {
			processedCore.setBrand(aboCoreMetadata.getBrand());
		}
		if (aboCoreMetadata.getMain_image_id() != null) {
			processedCore.setMain_image_id(aboCoreMetadata.getMain_image_id());
		}
		if (aboCoreMetadata.getNode() != null) {
			processedCore.setNode(aboCoreMetadata.getNode());
		}
		if (aboCoreMetadata.getOther_image_id() != null) {
			processedCore.setOther_image_id(aboCoreMetadata.getOther_image_id());
		}
	}
	
	public AboCollection parseRaw(ObjectMapper objectMapper, Map map) {
		AboCollection aboCollection = new AboCollection();
		
		ProcessedItem processedItem = new ProcessedItem();
		ProcessedModel processedModel = new ProcessedModel();
		ProcessedProduct processedProduct = new ProcessedProduct();
		
		String tempModelId = (String) map.get("3dmodel_id");
		
		AboItemMetadata aboItemMetadata = objectMapper.convertValue(map, AboItemMetadata.class);
		AboModelMetadata aboModelMetadata = objectMapper.convertValue(map, AboModelMetadata.class);
		AboProductMetadata aboProductMetadata = objectMapper.convertValue(map, AboProductMetadata.class);
		
		setCoreMetadata(aboItemMetadata, processedItem);
		setCoreMetadata(aboModelMetadata, processedModel);
		setCoreMetadata(aboProductMetadata, processedProduct);
		
		aboModelMetadata.setModel_id(tempModelId);
		
		//Processed Item Settings
		if (aboItemMetadata.getItem_dimensions() != null) {
			processedItem.setItem_dimensions(aboItemMetadata.getItem_dimensions());
		}
		if (aboItemMetadata.getItem_keywords() != null) {
			processedItem.setItem_keywords(aboItemMetadata.getItem_keywords());
		}
		if (aboItemMetadata.getItem_shape() != null) {
			processedItem.setItem_shape(aboItemMetadata.getItem_shape());
		}
		if (aboItemMetadata.getItem_weight() != null) {
			processedItem.setItem_weight(aboItemMetadata.getItem_weight());
		}
		
		//Processed Model Settings
		if (aboModelMetadata.getModel_id() != null) {
			processedModel.setModel_id(aboModelMetadata.getModel_id());
		}
		if (aboModelMetadata.getModel_name() != null) {
			processedModel.setModel_name(aboModelMetadata.getModel_name());
		}
		if (aboModelMetadata.getModel_number() != null) {
			processedModel.setModel_number(aboModelMetadata.getModel_number());
		}
		if (aboModelMetadata.getModel_year() != null) {
			processedModel.setModel_year(aboModelMetadata.getModel_year());
		}
		if (aboModelMetadata.getSpin_id() != null) {
			processedModel.setSpin_id(aboModelMetadata.getSpin_id());
		}
		
		//Processed Product Settings
		if (aboProductMetadata.getBullet_point() != null) {
			processedProduct.setBullet_point(aboProductMetadata.getBullet_point());
		}
		if (aboProductMetadata.getColor() != null) {
			processedProduct.setColor(aboProductMetadata.getColor());
		}
		if (aboProductMetadata.getColor_code() != null) {
			processedProduct.setColor_code(aboProductMetadata.getColor_code());
		}
		if (aboProductMetadata.getFabric_type() != null) {
			processedProduct.setFabric_type(aboProductMetadata.getFabric_type());
		}
		if (aboProductMetadata.getFinish_type() != null) {
			processedProduct.setFinish_type(aboProductMetadata.getFinish_type());
		}
		if (aboProductMetadata.getMaterial() != null) {
			processedProduct.setMaterial(aboProductMetadata.getMaterial());
		}
		if (aboProductMetadata.getPattern() != null) {
			processedProduct.setPattern(aboProductMetadata.getPattern());
		}
		if (aboProductMetadata.getProduct_description() != null) {
			processedProduct.setProduct_description(aboProductMetadata.getProduct_description());
		}
		if (aboProductMetadata.getStyle() != null) {
			processedProduct.setStyle(aboProductMetadata.getStyle());
		}
		
		aboCollection.setProcessedItem(processedItem);
		aboCollection.setProcessedModel(processedModel);
		aboCollection.setProcessedProduct(processedProduct);
		
		return aboCollection;
	}
}
