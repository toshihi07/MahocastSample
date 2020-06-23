package mahocast_sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("loginForm")
	public String viewLoginForm() {
		return "login/loginForm";
	}

}
	