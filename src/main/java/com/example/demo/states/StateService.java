package com.example.demo.states;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {
	
	@Autowired
	private StateRepository stateRepository;
	
	public List<State> getAllStates(){
		List<State> states = new ArrayList<>();
		stateRepository.findAll().forEach(states::add);
		return states;
	}
	
	public void addState(State state){
		stateRepository.save(state);
	}
	
	public Optional<State> getState(String stateCode) {
		return stateRepository.findById(stateCode);
	}
	
	public void updateState(State state, String stateCode) {
		stateRepository.save(state);
	}
	
	
	public void deleteState(String stateCode) {
		stateRepository.deleteById(stateCode);
	}
	
}
