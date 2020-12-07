package com.rpete.counterjava;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	@RequestMapping("")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			count += 1;
			session.setAttribute("count", count);
		}
		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer count = (Integer) session.getAttribute("count");
		model.addAttribute("count", count);
		System.out.println(count);
		return "counter.jsp";
	}
	
	@RequestMapping("/counter2")
	public String counter2(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 2);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			count += 2;
			session.setAttribute("count", count);
			model.addAttribute("count", count);
		}
		return "counter2.jsp";
	}
}
