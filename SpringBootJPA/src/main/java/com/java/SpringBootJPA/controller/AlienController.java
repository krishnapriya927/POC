package com.java.SpringBootJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.SpringBootJPA.dao.AlienRepo;
import com.java.SpringBootJPA.model.Alien;

@Controller
@RequestMapping("/")
public class AlienController
{
	@Autowired
	AlienRepo repo;
	@RequestMapping("/")
	public String home()
	{
		return "Main.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "AddMsg.jsp";
	}
	@RequestMapping("/delAlien")
	public String delAlien(@RequestParam int aid)
	{
		repo.delete(aid);
		return "DeleteMsg.jsp";	
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView alien(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView("ShowAlien.jsp");
		Alien alien=repo.findOne(aid);
		mv.addObject(alien);
		return mv;
	}
}
