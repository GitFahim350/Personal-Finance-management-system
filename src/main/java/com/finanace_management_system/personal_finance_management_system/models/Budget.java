package com.finanace_management_system.personal_finance_management_system.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "budgets")
public class Budget {
    @Id
    private String id;
    private String userId; // Reference to the User entity
    private String category; // e.g., "Groceries", "Entertainment"
    private double amount;
    private String startDate;
    private String endDate;
}
