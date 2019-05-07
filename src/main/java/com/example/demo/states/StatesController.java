package com.example.demo.states;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatesController {
	
	@Autowired
	private StateService stateService;
	
	@RequestMapping(method=RequestMethod.GET, value="/states")
	public List<State> getAllStates(){
		return stateService.getAllStates();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/states/{stateCode}")
	public Optional<State> getState(@PathVariable String stateCode) {
		return stateService.getState(stateCode);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/states")
	public void addState(@RequestBody State state) {
		stateService.addState(state);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/states/{stateCode}")
	public void updateState(@RequestBody State state, @PathVariable String stateCode) {
		stateService.updateState(state, stateCode);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/states/{stateCode}")
	public void deleteState(@PathVariable String stateCode) {
		stateService.deleteState(stateCode);
	}
	
}
