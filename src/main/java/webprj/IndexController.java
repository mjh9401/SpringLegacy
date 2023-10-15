package webprj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController{
	
	@RequestMapping("/hello.do")
	public String index() {
		return "index";
	}
	
	
}
