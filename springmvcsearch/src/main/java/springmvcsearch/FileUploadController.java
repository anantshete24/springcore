package springmvcsearch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;


@Configuration
public class FileUploadController {
	
	@Bean
	public MultipartResolver multipartResolver()
	{
		return new StandardServletMultipartResolver();
		
	}
	
	@RequestMapping("/fileform")
	public String showUploadForm()
	{

		return "fileform";
		
	}
	
	/*
	@RequestMapping(value="/uploadimage", method=RequestMethod.POST)
	
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file)
	{
		System.out.println("file upload handler");
		System.out.println(file.getSize());
		return "filesucess";
		
	}
*/
}
