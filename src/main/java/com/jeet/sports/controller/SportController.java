package com.jeet.sports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeet.sports.model.Sport;
import com.jeet.sports.service.SportService;

@Controller
public class SportController {
	
	@Autowired
	SportService service;

	@RequestMapping("/show-sport")
	public String showPage() {
		return "Sport-Reg";
	}
	
	@RequestMapping(value = "/insert-sport", method = RequestMethod.POST)
	public String insertSport(@ModelAttribute("sport") Sport sport,
			ModelMap map) {
		// Save Object
		String sportId = service.saveSport(sport);
		map.addAttribute("msg", "Sport saved with Id:" + sportId);
		return "Sport-Reg";
	}
	
	@RequestMapping(value="/view-all-sport")
	public String getAllSport(@RequestParam("msg") String msg, ModelMap map){
		List<Sport> list = null;
		list = service.getAllSports();
		if(list!=null){
			map.addAttribute("sportList", list);
			
		}
		if(msg.equalsIgnoreCase("0")){
			map.addAttribute("msg","");
		}else{
			map.addAttribute("msg", msg);
		}
		return "Sport-Data";
	}
	
	@RequestMapping(value="/edit-sport")
	public String editSport(@RequestParam("sportId") String sportId, ModelMap map){
		Sport sport = service.getSportById(sportId);
		if(Sport.class.isInstance(sport)){
			map.addAttribute("sport",sport);
		}
		return "Sport-Edit";
	}
	
	@RequestMapping(value="/update-sport", method = RequestMethod.POST)
	public String updateSport(@ModelAttribute("sport") Sport sport, ModelMap map){
		if(sport!=null){
			service.updateSport(sport);
		}
		
		return "redirect:/view-all-sport.htm?msg=Id "+sport.getSportId()+" is Updated";
	}
	
	@RequestMapping(value="/delete-sport")
	public String updateSport(@RequestParam("sportId") String sportId, ModelMap map){
		if(sportId!=null){
			service.deleteSport(sportId);
		}
		
		return "redirect:/view-all-sport.htm?msg=Id "+sportId+" is Deleted";
	}


}
