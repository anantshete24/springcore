package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
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
}
