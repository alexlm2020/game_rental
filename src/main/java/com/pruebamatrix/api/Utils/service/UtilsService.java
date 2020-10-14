package com.pruebamatrix.api.Utils.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebamatrix.api.Utils.repository.UtilsRepository;

@Service
public class UtilsService {

	@Autowired
	private UtilsRepository utilsRepository;
	
	public Timestamp getTime() {
		return utilsRepository.getTime();
	}

}
