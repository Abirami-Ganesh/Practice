package com.te.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te.springmvc.beans.UserDetail;

@Controller
public class ReadFormData {

//	Display Form Page
	@GetMapping("/user")
	public String displayFromPage() {
		return "form";
	}

//	First Way of reading the  form Data
	@PostMapping("/login1")
	public ModelAndView getDataOne(HttpServletRequest req, ModelAndView modelAndView) {

		Integer id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		modelAndView.addObject("userId", id);
		modelAndView.addObject("userName", name);
		modelAndView.setViewName("userdetails");
		return modelAndView;
	}// getDataOne

	@PostMapping("/login2")
	public String getDataTwo(@RequestParam(name = "id") Integer empId,
			@RequestParam(name = "name") String name, ModelMap  modelMap) {
		modelMap.addAttribute("userId", empId);
		modelMap.addAttribute("userName", name);
		return "userdetails";
	}
	
	@PostMapping("/login3")
	public String getDataThree(Integer id, String name, ModelMap modelMap) {
		modelMap.addAttribute("userId", id);
		modelMap.addAttribute("userName", name);
		return "userdetails";
	}

	@PostMapping("/login4")
	public String getDataFour(UserDetail user,String mail ,ModelMap map ) {
		map.addAttribute("data", user);
		System.out.println(mail);
		return "userdetails";
	}
}
