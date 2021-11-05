package com.gabs.vendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabs.vendas.dto.SaleDto;
import com.gabs.vendas.dto.SaleSumDto;
import com.gabs.vendas.dto.SuccessDto;
import com.gabs.vendas.entities.Sale;
import com.gabs.vendas.repositories.SaleRepository;
import com.gabs.vendas.repositories.SellerRepository;

@Service
public class SaleServiceImpl implements SaleService{

	@Autowired
	private SaleRepository saleRepos;
	
	@Autowired
	private SellerRepository sellerRepos;
	
	@Override
	@Transactional(readOnly = true)
	public Page<SaleDto> getAllSales(Pageable pageable) {
		//TODO essa é a melhor forma de reduzir as consultas no banco?
		sellerRepos.findAll();
		
		Page<Sale> result = saleRepos.findAll(pageable);
		return result.map(i -> new SaleDto(i));
	}

	
	@Override
	@Transactional(readOnly = true)
	public List<SaleSumDto> amountGroupedBySeller() {
		return saleRepos.amountGroupedBySeller();
	}


	@Override
	@Transactional(readOnly = true)
	public List<SuccessDto> successGroupedBySeller() {
		return saleRepos.successGroupedBySeller();
	}
	
}
