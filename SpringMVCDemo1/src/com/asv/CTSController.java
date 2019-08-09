package com.asv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CTSController {
	
	@RequestMapping("/login")
	public String gg(){
		return "login";
	}
	
	@RequestMapping("/signUp")
	public String gaag(){
		return "sign";
	}
	
	@RequestMapping("/apple")
	public String goong() {
		return "ball";
	}

	@RequestMapping("/doSome")
	public ModelAndView blah() {
		ModelAndView view = new ModelAndView();
		view.addObject("message","Hello,Today is Thursday. We will NOT be staying till 7PM today.");
		view.setViewName("sayHello");
		return view;
	}
}
