package com.can.profilemanagement.controller;

import com.can.profilemanagement.domain.EmployeeProfile;
import com.can.profilemanagement.service.EmployeeProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class EmployeeController {
	@Autowired
	EmployeeProfileService employeeProfileService;

	@PostMapping
	public void saveEmployeeProfile(@RequestBody EmployeeProfile employeeProfile){
		employeeProfileService.addEmployeeProfile(employeeProfile);
	}

	@GetMapping
	public List<EmployeeProfile> getAllEmployee(){
		return employeeProfileService.getEmployeeProfiles();
	}

}
