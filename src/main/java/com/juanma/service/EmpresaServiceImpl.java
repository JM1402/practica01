package com.juanma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanma.modell.Empresa;
import com.juanma.repository.EmpresaRepository;
@Service

public  class EmpresaServiceImpl implements EmpresaService{
	
	@Autowired
	EmpresaRepository empRepository;

	@Override
	public Empresa findById(long id) {
		
		return empRepository.findById(id);
	}

	@Override
	public Empresa findByRazon_social(String razon_social) {
		return empRepository.findByRazon_social();
	}

	@Override
	public void saveEmp(Empresa emp) {
			empRepository.save(emp);
	}

	@Override
	public void updateEmp(Empresa emp) {
		empRepository.save(emp);
		
	}

	@Override
	public void deleteEmpById(long id) {
		empRepository.deleteById(id);
		
	}

	@Override
	public List<Empresa> findAllEmps() {
	
		return empRepository.findAll();
	}

	@Override
	public void deleteAllEmps() {
		 empRepository.deleteAll();
	}

	@Override
	public boolean isEmpExist(Empresa emp) {
		return findByRazon_social(emp.getRazon_social())!=null;
	}

}

