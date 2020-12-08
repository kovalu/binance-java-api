package com.binance.api.client.domain.custom;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseId {
	
	private String purchaseId;
	
	@Override
	public String toString() {
		return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
				.append("purchaseId", purchaseId)
				.toString();
	}
	
	public String getPurchaseId() {
		return purchaseId;
	}
	
	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}
	
}
