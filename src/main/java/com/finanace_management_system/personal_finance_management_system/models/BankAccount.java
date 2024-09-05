package com.finanace_management_system.personal_finance_management_system.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "bank_accounts")
public class BankAccount {
    @Id
    private String id;
    private String userId; // Reference to the User entity
    private String accountNumber;
    private String bankName;
    private String accountType;
    private double balance;
}

