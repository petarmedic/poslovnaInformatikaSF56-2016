package com.poslovna.Poslovna.service;

import java.util.List;

import com.poslovna.Poslovna.domain.Preduzece;


public interface IPreduzeceService {

	List<Preduzece> findAll();

	Preduzece findOne(Long id);

	void save(Preduzece preduzece);

}
