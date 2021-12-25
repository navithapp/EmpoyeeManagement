package com.hrdemo.empmgmnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrdemo.empmgmnt.entity.Status;
import com.hrdemo.empmgmnt.service.StatusService;

@RestController
@RequestMapping(path = "/status")
public class StatusController {
	
	@Autowired 
	private StatusService statusService;
	
	public StatusController(StatusService statusService) {
		this.statusService = statusService;
	}

	@GetMapping(path = "/all")
	public List<Status> getAllStatus() {
		return statusService.getAllStatus();
	}
}
