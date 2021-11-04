package com.gabs.vendas.services;

import java.util.List;

import com.gabs.vendas.dto.SellerDto;
import com.gabs.vendas.entities.Seller;

public interface SellerService {
	List<SellerDto> getAllSellers();
}
