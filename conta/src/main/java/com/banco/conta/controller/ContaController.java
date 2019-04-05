package com.banco.conta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.banco.conta.dao.ContaRepository;
import com.banco.conta.model.Conta;

@Controller
public class ContaController {
	
	@Autowired
	ContaRepository repository;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
//	@RequestMapping("/criarConta")
//	public String addValue(Conta conta) {
//		repository.save(conta);
//		return "home.jsp";
//	}
	
	@RequestMapping("/transacoes")
	public ModelAndView transacoes(@RequestParam int id) {	
		
		ModelAndView mv = new ModelAndView("transacoes.jsp");
		Conta conta = repository.findById(id).orElse(new Conta());
		mv.addObject(conta);
		
		return mv;
	}
	
	@RequestMapping("/executar")
	public ModelAndView executar(@RequestParam double valor, Conta conta, double saldo) {		

		ModelAndView mv = new ModelAndView("executar.jsp");
		
		//realizar saque e deposito
		
		repository.save(conta);
		
		return mv;
	}

}
