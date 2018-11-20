package com.juanma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanma.modell.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	Empresa findById(long id);
	Empresa findByRazon_social();
}
