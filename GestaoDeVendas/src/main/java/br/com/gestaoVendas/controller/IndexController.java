package br.com.gestaoVendas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	 @RequestMapping("/login.html")
	   public String index()
	   {
	      return "home/login";
	   }
}
