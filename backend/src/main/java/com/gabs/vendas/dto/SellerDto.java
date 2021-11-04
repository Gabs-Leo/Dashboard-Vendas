package com.gabs.vendas.dto;

import java.io.Serializable;
import java.util.Optional;

import com.gabs.vendas.entities.Seller;

public class SellerDto implements Serializable {
	
	//Implementa Serializable
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public SellerDto() {}
	
	public SellerDto(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//Construtor que usa como base uma entidade
	public SellerDto(Seller entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
