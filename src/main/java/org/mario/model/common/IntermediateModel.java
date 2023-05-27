package org.mario.model.common;

import org.mario.model.raw.AboItemMetadata;
import org.mario.model.raw.AboModelMetadata;
import org.mario.model.raw.AboProductMetadata;

public class IntermediateModel {
	private AboItemMetadata aboItemMetadata;
	private AboModelMetadata aboModelMetadata;
	private AboProductMetadata aboProductMetadata;
	
	public AboItemMetadata getAboItemMetadata() {
		return aboItemMetadata;
	}
	
	public void setAboItemMetadata(AboItemMetadata aboItemMetadata) {
		this.aboItemMetadata = aboItemMetadata;
	}
	
	public AboModelMetadata getAboModelMetadata() {
		return aboModelMetadata;
	}
	
	public void setAboModelMetadata(AboModelMetadata aboModelMetadata) {
		this.aboModelMetadata = aboModelMetadata;
	}
	
	public AboProductMetadata getAboProductMetadata() {
		return aboProductMetadata;
	}
	
	public void setAboProductMetadata(AboProductMetadata aboProductMetadata) {
		this.aboProductMetadata = aboProductMetadata;
	}
}
