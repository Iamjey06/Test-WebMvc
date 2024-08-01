package testingWeb.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FirstController {

	
	@RequestMapping("/momcafe")
	public String getSugar(Model model) {
		
		model.addAttribute("myCafe", "MOM'S CAFE");
		
		model.addAttribute("myName", "Joshua");
		
		return"momcafe";
	}
	
	@RequestMapping("/processOrder")
	public String prcessOrder(HttpServletRequest request ,Model model) {
	    
	    String foodType = request.getParameter("food type");
	    
	    model.addAttribute("value", foodType);
	    
	    return"processorder";
	}
	
}
