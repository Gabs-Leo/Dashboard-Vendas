package com.gabs.vendas.dto;

import com.gabs.vendas.entities.Seller;

public class SaleSumDto {
	private String sellerName;
	private Double sum;
	
	public SaleSumDto() {}

	public SaleSumDto(Seller seller, Double sum) {
		super();
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
}
