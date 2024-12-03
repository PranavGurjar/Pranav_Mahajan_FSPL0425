package com.sampleProject.EmployeeManagementSystem.service;

import com.sampleProject.EmployeeManagementSystem.dto.DesignationDTO;
import com.sampleProject.EmployeeManagementSystem.entity.Designation;
import com.sampleProject.EmployeeManagementSystem.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DesignationService {

    @Autowired
    private DesignationRepository designationRepository;

    public Designation addData(DesignationDTO designationDTO){
        Designation designation = new Designation();

        //Map DTO values to Entity
        designation.setDesignationName(designationDTO.getDesignationName());
        designation.setActive(true); // Assuming all new employees are active by default
        designation.setCreateBy(designationDTO.getCreateBy());
        designation.setUpdateBy(designationDTO.getUpdateBy());
        designation.setCreateDate(LocalDateTime.now());
        designation.setUpdatedDate(LocalDateTime.now());

        return designationRepository.save(designation);
    }
}
