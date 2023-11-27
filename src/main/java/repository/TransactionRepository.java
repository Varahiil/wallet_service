package repository;

import by.itstep.dto.Transaction;

import java.util.List;
import java.util.UUID;

public interface TransactionRepository {
    void save(Transaction transaction);

    Transaction getById(UUID uuid);

    void update(Transaction transaction);

    void delete(Transaction transaction);

    List<Transaction> getAll();

}
