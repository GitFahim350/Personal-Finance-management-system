package com.finanace_management_system.personal_finance_management_system.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "loans")
public class Loan {
    @Id
    private String id;
    private String userId; // Reference to the User entity
    private String loanType; // e.g., "Mortgage", "Personal"
    private double amount;
    private double interestRate;
    private String startDate;
    private String endDate;
    private String description;
}
