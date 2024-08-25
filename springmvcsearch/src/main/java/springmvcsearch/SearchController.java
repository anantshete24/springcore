package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home()
	{
		
		String str=null;
		System.out.println(str.length());
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox")String query)
	{
		String url="https://www.google.com/search?q="+query;
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
	@RequestMapping("/user/{userId}/{userName}")

	public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName)
	{
		System.out.println(userId);
		System.out.println(userName);
		Integer.parseInt(userName);
		return "home";
	}
	
	/*
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandling(Model m)
	{
		m.addAttribute("msg", "null pointer exeption has occured");
		return "null_page";
	}
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionNumberFormat(Model m)
	{
	
		m.addAttribute("msg", "number format exeption has occured");
		return "null_page";
	}
	//Generic exception handling
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerGeneric(Model m)
	{
	
		m.addAttribute("msg", "exeption has occured");
		return "null_page";
	}
	*/
}
