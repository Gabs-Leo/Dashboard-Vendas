package com.gabs.vendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabs.vendas.dto.SellerDto;
import com.gabs.vendas.services.SellerServiceImpl;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
	
	@Autowired
	private SellerServiceImpl sellers;
	
	@GetMapping()
	public ResponseEntity<List<SellerDto>> findAll(){
		List<SellerDto> list = sellers.getAllSellers();
		return ResponseEntity.ok(list);
	}
}
