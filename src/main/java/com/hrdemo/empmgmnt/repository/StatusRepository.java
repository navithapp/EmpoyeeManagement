package com.hrdemo.empmgmnt.repository;

import org.springframework.data.repository.CrudRepository;

import com.hrdemo.empmgmnt.entity.Status;

public interface StatusRepository extends CrudRepository<Status, Integer> {

}
