package org.mario.model.common;

import org.mario.model.processed.ProcessedItem;
import org.mario.model.processed.ProcessedModel;
import org.mario.model.processed.ProcessedProduct;

public class AboCollection {
	private ProcessedItem processedItem;
	private ProcessedModel processedModel;
	private ProcessedProduct processedProduct;
	
	
	public ProcessedItem getProcessedItem() {
		return processedItem;
	}
	
	public void setProcessedItem(ProcessedItem processedItem) {
		this.processedItem = processedItem;
	}
	
	public ProcessedModel getProcessedModel() {
		return processedModel;
	}
	
	public void setProcessedModel(ProcessedModel processedModel) {
		this.processedModel = processedModel;
	}
	
	public ProcessedProduct getProcessedProduct() {
		return processedProduct;
	}
	
	public void setProcessedProduct(ProcessedProduct processedProduct) {
		this.processedProduct = processedProduct;
	}
}
