package com.nksolucoes.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nksolucoes.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
