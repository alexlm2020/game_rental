package com.pruebamatrix.api.modules.tecnology.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebamatrix.api.modules.tecnology.model.Tecnology;
import com.pruebamatrix.api.modules.tecnology.service.TecnologyServiceImp;

@Controller
@RequestMapping("/api/tecnologies")
public class TecnologyController {

	@Autowired
	private TecnologyServiceImp tecnologyServiceImp;
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Tecnology tecnology) throws Exception{
		return ResponseEntity.status(HttpStatus.CREATED).body(tecnologyServiceImp.save(tecnology));
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<?> read (@PathVariable(value = "id") Long idTecnology) throws Exception {
		Optional<Tecnology> oTecnology = tecnologyServiceImp.findById(idTecnology);
		if (!oTecnology.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oTecnology);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> read () throws Exception {
		List<Tecnology> oTecnologies = tecnologyServiceImp.findAll();
		if (oTecnologies.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oTecnologies);
	}
	
}

