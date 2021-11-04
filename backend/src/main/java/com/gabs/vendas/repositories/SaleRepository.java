package com.gabs.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabs.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{}
