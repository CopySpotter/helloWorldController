package masterSpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloController 
{
    //@RequestMapping("/")  // Aufruf mit http://localhost:8080
    @RequestMapping("/2") // Aufruf mit http://localhost:8080/2
	//@RequestMapping("/1") // Aufruf mit http://localhost:8080/1
	@ResponseBody
	public String hello() 
	{
	  return "Hello you bugger!! ...,.... world from HelloController!";
    }
}