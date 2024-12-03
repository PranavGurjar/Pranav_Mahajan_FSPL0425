package com.sampleProject.EmployeeManagementSystem.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DesignationDTO {
    private String designationName;
    private boolean isActive;
    private String createBy;
    private LocalDateTime createDate;
    private String updateBy;
    private LocalDateTime updatedDate;
}
