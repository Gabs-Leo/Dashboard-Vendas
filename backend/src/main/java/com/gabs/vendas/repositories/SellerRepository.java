package com.gabs.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabs.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{}
