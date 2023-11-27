package service;

import by.itstep.dto.Transaction;
import by.itstep.dto.TransactionResult;
import by.itstep.dto.TransactionType;
import exception.TransactionNotUnique;
import repository.TransactionRepository;

import java.util.UUID;

public class InMemoryTransactionService {
    private TransactionRepository transactionRepository;

    public InMemoryTransactionService(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }

    public void debit(Long amount){
        UUID uuid = UUID.randomUUID();
        Transaction foundTransaction =  transactionRepository.getById(uuid);
        if (foundTransaction != null) {
            Transaction newTransaction = new Transaction(TransactionType.DEBIT,
                    uuid,
                    amount,
                    TransactionResult.FAILURE);
            transactionRepository.save(newTransaction);
            throw new TransactionNotUnique("Transaction " + uuid + " not unique");
        }
        else{
            Transaction newTransaction = new Transaction(TransactionType.DEBIT,
                    uuid,
                    amount,
                    TransactionResult.SUCCESS);
            transactionRepository.save(newTransaction);
        }
    }
}
