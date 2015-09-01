package com.concretepage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.concretepage.component.IPersonService;



// http://www.concretepage.com/spring-4/spring-4-mvc-example-using-maven-eclipse

// Good example to get POST rest style information back here to server/program, then present the fetched/GEt info via JSP
// 
//  TO RUN: http://localhost:8080/Spring4-1/page/login?userId=concretePage&location=Varanasi 

// for MVC use controller annotation


@Controller
@RequestMapping("/page")
public class PersonController {
	
	@Autowired
	private IPersonService personService;
	
	@RequestMapping("/login")
    public String hello(@RequestParam(value="userId", required=false) String userId, @RequestParam(value="location", required=false) String location,
    		Model model) {
		
	        model.addAttribute("msg", "Hello "+personService.getPersonName() );
	        model.addAttribute("userId", userId);
	        model.addAttribute("location", location);
	        
	        String dummy = new String("using result JSP page 1") ;
	        model.addAttribute("dummyTest", dummy);
	        
	        // name of JSP page to return above model attributes to 
            return "result";
	}
	
	
	//setup a second controller 
	@RequestMapping("/login2")
    public String hello2(@RequestParam(value="userId", required=false) String userId, @RequestParam(value="location", required=false) String location,
    		Model model) {
		
	        model.addAttribute("msg", "Hello "+personService.getPersonName() );
	        model.addAttribute("userId", userId);
	        model.addAttribute("location", location);
	        
	        String dummy = new String("using result JSP page 2") ;
	        model.addAttribute("dummyTest", dummy);
	        
	        // name of JSP page to return above model attributes to 
            return "result2";
	}
	
	
	
	
	
}