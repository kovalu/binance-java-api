package com.binance.api.client.domain.custom;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlexibleSavingsProductPosition {
	
	private String asset;
	private String productId;
	private String productName;
	private boolean canRedeem;
	private String totalAmount;
	private String freeAmount;
	private String redeemingAmount;
	private String totalInterest;
	
	@Override
	public String toString() {
		return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
				.append("asset", asset)
				.append("productId", productId)
				.append("productName", productName)
				.append("canRedeem", canRedeem)
				.append("totalAmount", totalAmount)
				.append("freeAmount", freeAmount)
				.append("redeemingAmount", redeemingAmount)
				.append("totalInterest", totalInterest)
				.toString();
	}
	
	public String getAsset() {
		return asset;
	}
	
	public void setAsset(String asset) {
		this.asset = asset;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public boolean isCanRedeem() {
		return canRedeem;
	}
	
	public void setCanRedeem(boolean canRedeem) {
		this.canRedeem = canRedeem;
	}
	
	public String getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String getFreeAmount() {
		return freeAmount;
	}
	
	public void setFreeAmount(String freeAmount) {
		this.freeAmount = freeAmount;
	}
	
	public String getRedeemingAmount() {
		return redeemingAmount;
	}
	
	public void setRedeemingAmount(String redeemingAmount) {
		this.redeemingAmount = redeemingAmount;
	}
	
	public String getTotalInterest() {
		return totalInterest;
	}
	
	public void setTotalInterest(String totalInterest) {
		this.totalInterest = totalInterest;
	}
	
}
