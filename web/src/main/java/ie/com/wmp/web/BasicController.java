package ie.com.wmp.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@RequestMapping("/test")
	String home(){
		return "Hello, worldee.wwss..";		
	}

}
