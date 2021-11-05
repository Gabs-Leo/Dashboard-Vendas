package com.gabs.vendas.dto;

import com.gabs.vendas.entities.Seller;

public class SuccessDto {
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SuccessDto(){}
	
	public SuccessDto(Seller seller, Long visited, Long deals) {
		super();
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public Long getVisited() {
		return visited;
	}
	public void setVisited(Long visited) {
		this.visited = visited;
	}
	public Long getDeals() {
		return deals;
	}
	public void setDeals(Long deals) {
		this.deals = deals;
	}
}
