package com.mongodb.connectivity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.connectivity.entity.TeamInfoEntity;
import com.mongodb.connectivity.repository.TeamInfoRepo;

@RestController
public class TeamInfoController {
	
	@Autowired
	TeamInfoRepo teamRepo;
	
	@RequestMapping(value="/getTeams")
	public List<TeamInfoEntity> getTeams(){
		return teamRepo.findAll();
	}
	
	@RequestMapping(value="/getMembers/{team}")
	public List<String> getMembers(@PathVariable String team){
		return teamRepo.findByTeamName(team);
	}

}
