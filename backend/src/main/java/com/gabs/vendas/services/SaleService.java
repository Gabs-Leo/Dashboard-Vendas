package com.gabs.vendas.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gabs.vendas.dto.SaleDto;
import com.gabs.vendas.dto.SaleSumDto;
import com.gabs.vendas.dto.SuccessDto;

public interface SaleService {
	Page<SaleDto> getAllSales(Pageable pageable);
	List<SaleSumDto> amountGroupedBySeller();
	List<SuccessDto> successGroupedBySeller();
}
