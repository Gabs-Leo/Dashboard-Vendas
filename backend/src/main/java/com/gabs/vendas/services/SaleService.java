package com.gabs.vendas.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gabs.vendas.dto.SaleDto;

public interface SaleService {
	Page<SaleDto> getAllSales(Pageable pageable);
}
