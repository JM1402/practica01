package com.juanma.service;

import java.util.List;

import com.juanma.modell.Empresa;

public interface EmpresaService {
	
	Empresa findById(long id);
	
	Empresa findByRazon_social(String razon_social);
	
	void saveEmp(Empresa emp);
	
	void updateEmp(Empresa emp);
	
	void deleteEmpById(long id);
	
	List<Empresa> findAllEmps();
	
	void deleteAllEmps();
	
	public boolean isEmpExist(Empresa emp);

}