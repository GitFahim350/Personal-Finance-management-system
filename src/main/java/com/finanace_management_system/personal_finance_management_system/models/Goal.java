package com.finanace_management_system.personal_finance_management_system.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "goals")
public class Goal {
    @Id
    private String id;
    private String userId; // Reference to the User entity
    private String goalName;
    private double targetAmount;
    private double currentAmount;
    private String targetDate;
    private String description;
}

