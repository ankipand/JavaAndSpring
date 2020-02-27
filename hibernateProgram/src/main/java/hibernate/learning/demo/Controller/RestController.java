package hibernate.learning.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/e")
public class RestController {
	@RequestMapping(value="/h")
	public String hello() {
	return "Hello World from Tomcat";
	}
}
