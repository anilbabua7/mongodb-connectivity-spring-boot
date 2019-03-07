package com.mongodb.connectivity.entity;

import java.util.List;

public class TeamName {

	private List<String> members;
	
	public TeamName() {
		
	}

	public List<String> getTeamName() {
		return members;
	}

	public void setTeamName(List<String> teamName) {
		this.members = teamName;
	}

}
