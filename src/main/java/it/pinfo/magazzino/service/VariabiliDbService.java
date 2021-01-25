package it.pinfo.magazzino.service;

import java.util.List;

import it.pinfo.magazzino.entity.VariabiliDb;

public interface VariabiliDbService {

	public VariabiliDb findById(Integer id);

	public List<VariabiliDb> findAll();

	public VariabiliDb save(VariabiliDb indice);

	public void delete(Integer id);

}
