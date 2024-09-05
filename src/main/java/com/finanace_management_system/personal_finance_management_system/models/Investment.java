package com.finanace_management_system.personal_finance_management_system.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "investments")
public class Investment {
    @Id
    private String id;
    private String userId; // Reference to the User entity
    private String investmentType; // e.g., "Stocks", "Real Estate"
    private double amount;
    private String description;
    private String date;
}

