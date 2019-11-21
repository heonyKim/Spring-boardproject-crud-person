package com.cos.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class testController {

	
	@GetMapping("/lookjsp")
	public String test2() {
		return "home";
	}
	
}
