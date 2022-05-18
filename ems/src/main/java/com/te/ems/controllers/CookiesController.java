package com.te.ems.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookies")
public class CookiesController {

	@GetMapping("/show")
	public String getCookiePage() {
		return "cookiePage";
	}

	@GetMapping("/create")
	public String createCookie(HttpServletResponse resp, ModelMap model) {
		Cookie cookie = new Cookie("user", "SAI");
		Cookie cookie2 = new Cookie("Chennai", "RedAlert");
		cookie2.setMaxAge(30);
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		model.addAttribute("msg", "created Cookies.....");
		return "cookiePage";
	}

	@GetMapping("/read")
	public String readCookie(@CookieValue(name = "JSESSIONID" ,required = false)String user, 
			HttpServletRequest req, ModelMap map) {
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
		}
		map.addAttribute("msg", "User ID is "+ user);
		return "cookiePage";
	}
	
}
