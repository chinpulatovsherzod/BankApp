package com.example.demo.service;

import com.example.demo.model.Transaction;
import com.example.demo.repository.TransactionalRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionalRepos transactionalRepos;

    public List<Transaction> findByAccountId(Long accountId){
        return transactionalRepos.findByAccountId(accountId);
    }

    public void saveTransaction(Transaction transaction){
        transactionalRepos.save(transaction);
    }
}
