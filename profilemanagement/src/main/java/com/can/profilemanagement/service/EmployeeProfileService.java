package com.can.profilemanagement.service;

import com.can.profilemanagement.domain.EmployeeProfile;

import java.util.List;

public interface EmployeeProfileService {
	void addEmployeeProfile(EmployeeProfile profile);
	List<EmployeeProfile> getEmployeeProfiles();
}
