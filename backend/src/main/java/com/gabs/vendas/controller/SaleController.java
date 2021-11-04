package com.gabs.vendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabs.vendas.dto.SaleDto;
import com.gabs.vendas.services.SaleServiceImpl;

@RestController
@RequestMapping("/sales")
public class SaleController {
	@Autowired
	private SaleServiceImpl sales;
	
	@GetMapping()
	public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
		Page<SaleDto> list = sales.getAllSales(pageable);
		return ResponseEntity.ok(list);
	}
}
