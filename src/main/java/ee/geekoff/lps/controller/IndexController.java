package ee.geekoff.lps.controller;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ee.geekoff.lps.logic.TokenHandler;


@Controller
public class IndexController {
	
	
	@RequestMapping(value = "/*")
	public ModelAndView listSomething(ModelAndView model) throws IOException {
		// obtain token
		int typeId = 1233346653;

		List<String> listRating = new ArrayList<>(); 
		model.addObject("typeId", typeId);
		model.setViewName("index");

		return model;
	}
	
	@RequestMapping(value = "/token")
	public ModelAndView  generateToken(ModelAndView model) throws IOException {
		// obtain token
		
		TokenHandler newToken = new TokenHandler();
		String token = newToken.nextToken();
		
		model.addObject("token", token);
		
		model.setViewName("token");
		
		return model;
	}
	
	@RequestMapping(value = "/dd")
	public ModelAndView listCompanyo(ModelAndView model) throws IOException {

		int typeId = 133355555;
		// if there is no db, use dummy list instead
		//List<Company> listCompany = companyDAO.list(typeId);
		//List<Company> listCompany = companyDAO.list(typeId);
		
		List<String> listCompany1 = Arrays.asList("Test11000","Test22000");
		model.addObject("listCompany", listCompany1);
		model.setViewName("index");

		return model;
	}
	
	
	
	
	@RequestMapping(value = "/navigate", method = RequestMethod.GET)
	public ModelAndView listCompany(ModelAndView model, HttpServletRequest request) {
		int typeId = 255588888;
		
		model.addObject("typeId", typeId);
		List<String> listCompany = Arrays.asList("Test1111","Test2222");
		model.addObject("listCompany", listCompany);
		model.setViewName("navigate");

		return model;
	}
	
	
	
	
	// 
	@RequestMapping(value = "/beacon", method = RequestMethod.GET)
	public void listStartingPointMacs(ModelAndView model, HttpServletRequest request) {

		String mac = request.getParameter("mac");
		List<String> listDestinations = Arrays.asList("Kabinet A", "Kabinet B");
		 
		System.out.print(mac);
	}
}