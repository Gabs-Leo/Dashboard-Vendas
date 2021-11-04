package com.gabs.vendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gabs.vendas.dto.SaleDto;
import com.gabs.vendas.entities.Sale;
import com.gabs.vendas.repositories.SaleRepository;

@Service
public class SaleServiceImpl implements SaleService{

	@Autowired
	private SaleRepository saleRepos;
	
	@Override
	public Page<SaleDto> getAllSales(Pageable pageable) {
		Page<Sale> result = saleRepos.findAll(pageable);
		return result.map(i -> new SaleDto(i));
	}
	
}
