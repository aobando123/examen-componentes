package com.cenfotec.examen.controllers;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cenfotec.examen.domain.Productor;
import com.cenfotec.examen.repository.FincaRepository;
import com.cenfotec.examen.repository.ProductorRepository;

@Controller
public class ProductorController {
	@Autowired
	private ProductorRepository repo;
	
	@Autowired
	private FincaRepository repoFinca;
	@GetMapping("/")
	public String getAllProductor (Model model) {
		model.addAttribute("productores", repo.findAll());
		model.addAttribute("productor", new Productor());
		return "index";
	}
	@GetMapping("/{id}")
	public String getProductor(@PathVariable String id, Model model) {
		model.addAttribute("productor", repo.findById(id).get());
		model.addAttribute("fincas", repoFinca.fincaByCedula(id));
		return "productor";
	}
	@PostMapping("/")
	public String postProductor (Productor productor, Model model) {
		repo.save(productor);
		model.addAttribute("productores", repo.findAll());
		model.addAttribute("productor", new Productor());
		return "index";
	}
	
	@GetMapping("/buscar")
	public String searchProductor (Model model) {
		List<Productor> lProductor = new ArrayList<Productor>();
		model.addAttribute("productor", new Productor());
		model.addAttribute("bProductores",lProductor);
		return "buscarProductor";
	}
	
	@PostMapping("/buscar")
	public String searchProductorByName (Productor productor, Model model) {
		model.addAttribute("productor", new Productor());
		model.addAttribute("bProductores",repo.findBynombreLike(productor.getNombre()));
		return "buscarProductor";
	}
}
