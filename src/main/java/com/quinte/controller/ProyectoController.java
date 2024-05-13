package com.quinte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.quinte.model.Subject;
import com.quinte.repository.ISubjectRepository;



@Controller
public class ProyectoController {
	@Autowired
	private ISubjectRepository repos;
	
	@GetMapping("/registrar")
	public String registrerSubject(@RequestParam(name="name", required=false,defaultValue="Subject")String name, Model model ) {
		Subject subj = new Subject();
		subj.setIdSubject(1);
		subj.setCode("COD0102");
		subj.setName("Lenguajes de Programacion II");
		subj.setLevel("Básico");
		subj.setTeacher("Juan Perez");
		
		subj=repos.save(subj);
		model.addAttribute("name",subj);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String listSubject(Model model) {
		model.addAttribute("ltsSubject",repos.findAll());
		return "listado";
	}

}
