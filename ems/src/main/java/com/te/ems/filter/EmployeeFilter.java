package com.te.ems.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class EmployeeFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("filter - init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(" inside doFilter");
		HttpServletRequest  req = (HttpServletRequest) request;
		System.out.println(" URL : "+ req.getRequestURL());
		System.out.println(" URI : "+ req.getRequestURI());
		if (req.getRequestURI().equals("/ems/search")) {
			System.out.println("Id = "+ req.getParameter("id"));
		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("Filter - destroy");
	}

}
