package mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SpringController {
	@RequestMapping("/")
	public ModelAndView getSamplePage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message","<h1>hello chaitanya</h1>");
		modelAndView.setViewName("home");
		return modelAndView;
	}
    }