package com.finanace_management_system.personal_finance_management_system.models;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String userId; // Reference to the User entity
    private String bankAccountId; // Reference to the BankAccount entity
    private String type; // e.g., "Deposit", "Withdrawal"
    private double amount;
    private String description;
    private String date;
}
