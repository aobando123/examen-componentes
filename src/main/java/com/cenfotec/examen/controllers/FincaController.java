package com.cenfotec.examen.controllers;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cenfotec.examen.domain.Finca;
import com.cenfotec.examen.domain.Productor;
import com.cenfotec.examen.repository.FincaRepository;
import com.cenfotec.examen.repository.ProductorRepository;

@Controller
public class FincaController {
	@Autowired
	FincaRepository repo;
	
	@Autowired
	ProductorRepository repoProductores;
	
	@GetMapping("/finca")
	public String getFincas(Model model) {
		List<Finca> listaFinca = repo.findAll();
		for (Finca finca : listaFinca) {
			Optional<Productor> prod = repoProductores.findById(finca.getDueno().getCedula());
			finca.setDueno(prod.get());
		}
		model.addAttribute("fincas", listaFinca);
		model.addAttribute("productores", repoProductores.findAll());
		model.addAttribute("finca", new Finca());
		return "finca";
	}
	@PostMapping("/finca")
	public String postFincas(Finca finca, Model model) {
		repo.save(finca);
		List<Finca> listaFinca = repo.findAll();
		for (Finca fin : listaFinca) {
			Optional<Productor> prod = repoProductores.findById(fin.getDueno().getCedula());
			fin.setDueno(prod.get());
		}
		model.addAttribute("fincas", listaFinca);
		model.addAttribute("finca", new Finca());
		model.addAttribute("productores", repoProductores.findAll());

		return "finca";
	}
}
