package com.hrdemo.empmgmnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrdemo.empmgmnt.entity.Status;
import com.hrdemo.empmgmnt.repository.StatusRepository;

@Service
public class StatusServiceImpl implements StatusService {
	
	@Autowired 
	private StatusRepository statusRepository;
	
	public StatusServiceImpl(StatusRepository statusRepository) {
		this.statusRepository = statusRepository;
	}
	
	@Override
	public List<Status> getAllStatus() {
		return (List<Status>) this.statusRepository.findAll();
	}
}
