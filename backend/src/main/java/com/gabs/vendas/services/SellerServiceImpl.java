package com.gabs.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabs.vendas.dto.SellerDto;
import com.gabs.vendas.entities.Seller;
import com.gabs.vendas.repositories.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService{
	
	@Autowired
	private SellerRepository sellerRepos;

	@Override
	public List<SellerDto> getAllSellers() {
		List<Seller> result = sellerRepos.findAll();
		return result.stream().map(i -> new SellerDto(i)).collect(Collectors.toList());
	}
}
