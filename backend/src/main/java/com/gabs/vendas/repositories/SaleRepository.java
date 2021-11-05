package com.gabs.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gabs.vendas.dto.SaleSumDto;
import com.gabs.vendas.dto.SuccessDto;
import com.gabs.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

	@Query("SELECT new com.gabs.vendas.dto.SaleSumDto(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDto> amountGroupedBySeller();
	
	@Query("SELECT new com.gabs.vendas.dto.SuccessDto(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SuccessDto> successGroupedBySeller();
}
