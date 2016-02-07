package com.actofgod.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class ActOfGodMessengerHelloWord {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
<<<<<<< HEAD
		return new ModelAndView("welcome i change", "message", message);
=======
		return new ModelAndView("welcome i fssds", "message", message);
>>>>>>> branch 'master' of https://github.com/HyperLoopExpert/TestMeknow.git
	}
}
