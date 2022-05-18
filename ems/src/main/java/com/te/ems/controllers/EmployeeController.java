package com.te.ems.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.support.WebBindingInitializer;

import com.te.ems.beans.EmployeeInfo;
import com.te.ems.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired(required = false)
	private EmployeeService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Init");
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@GetMapping("/login")
	public String getLoginForm() {
		return "LoginForm";
	}// end of getLoginForm

	@GetMapping("/signup")
	public String getRegForm() {
		return "signUp";
	}// end of getRegForm

	@PostMapping("/login")
	public String authenticate(Integer id, String pwd, ModelMap map, HttpServletRequest request) {
		EmployeeInfo info = service.authenticate(id, pwd);
		if (info != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("isLoggedIn", info);
//			session.setMaxInactiveInterval(60);
			map.addAttribute("user", info);
			return "welcome";
		} else {
			map.addAttribute("err", "Invalid Credentials");
			return "LoginForm";
		}
	}// end of authenticate

	@GetMapping("/searchPage")
	public String getSearchPage(HttpSession session, ModelMap map) {
		if (session.getAttribute("isLoggedIn") != null) {
			return "search";
		} else {
			map.addAttribute("err", "Please Login First");
			return "LoginForm";
		}

	}

	@GetMapping("/search")
	public String sendSearchData(@SessionAttribute(name = "isLoggedIn", required = false) EmployeeInfo info, Integer id,
			ModelMap map) {
		if (info != null) {
			EmployeeInfo info1 = service.getEmployee(id);
			if (info1 != null) {
				map.addAttribute("user", info1);
			} else {
				map.addAttribute("msg", "Data not found");
			}
			return "search";
		} else {
			map.addAttribute("err", "Please Login First");
			return "LoginForm";
		}

	}// end of sendSearchData

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {
		session.invalidate();
		map.addAttribute("err", "Logged out successfully");
		return "LoginForm";
	}

	@GetMapping("/deleteuser")
	public String getDeletePage(@SessionAttribute(name = "isLoggedIn", required = false) EmployeeInfo info,
			ModelMap map) {
		if (info != null) {
			return "delete";
		} else {
			map.addAttribute("err", "Please Login First");
			return "LoginForm";
		}

	}//

	@GetMapping("/delete")
	public String deleteData(Integer id, @SessionAttribute(name = "isLoggedIn", required = false) EmployeeInfo info,
			ModelMap map) {
		if (info != null) {

			service.delete(id);
			map.addAttribute("msg", "Deleted Data for " + id);
			return "delete";
		} else {
			map.addAttribute("err", "Please Login First");
			return "LoginForm";
		}
	}//

	@PostMapping("/register")
	public String registerUser(EmployeeInfo info, ModelMap map) {
		if (service.register(info)) {
			map.addAttribute("err", "Registered Successfully");
			return "LoginForm";
		} else {
			map.addAttribute("err", "Data already Exist");
			return "signUp";
		}
	}

	@GetMapping("/updateData")
	public String getUpdateForm(
			@SessionAttribute(name = "isLoggedIn", required = false) EmployeeInfo info,
			ModelMap map) {
		if (info != null) {
			map.addAttribute("user",info);
			return "update";
		} else {
			map.addAttribute("err", "Please Login First");
			return "LoginForm";
		}

	}//
	
	@PostMapping("/update")
	public String updateRecord(@SessionAttribute(name = "isLoggedIn", required = false)
			EmployeeInfo info,
			ModelMap map , EmployeeInfo bean) {
		if (info != null) {
			if (service.update(bean)) {
				map.addAttribute("msg", "Updated Successfully");
			}
			else {
				map.addAttribute("msg", "Something Went Wrong");
			}
			map.addAttribute("user",info);
			return "update";
		} else {
			map.addAttribute("err", "Please Login First");
			return "LoginForm";
		}
	}

}
