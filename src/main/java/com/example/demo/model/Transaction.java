package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    private String type;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;


    public Transaction(BigDecimal amount, String deposit, LocalDateTime now, Account account){
    }

    public Transaction(Long id, Account account, LocalDateTime timestamp, String type, BigDecimal amount) {
        this.id = id;
        this.account = account;
        this.timestamp = timestamp;
        this.type = type;
        this.amount = amount;
    }

    public Transaction() {

    }


}

