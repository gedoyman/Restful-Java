package com.example.demo.states;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
	
	@Id
	@Column(name="state_code")
	private String stateCode;
	
	@Column(name="state_name")
	private String stateName;
	
	
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public State(String stateCode, String stateName) {
		super();
		this.stateCode = stateCode;
		this.stateName = stateName;
	}



	
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
}
