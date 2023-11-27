package repository;

import by.itstep.dto.Transaction;
import exception.TransactionNotFound;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class InMemoryTransactionRepository implements TransactionRepository{

    private HashMap<UUID, Transaction> inMemoryStorage;

    InMemoryTransactionRepository(HashMap<UUID, Transaction inMemoryStorage)
    {
        this.inMemoryStorage = inMemoryStorage;
    }


    public void save(Transaction transaction) {
      inMemoryStorage.put(transaction.getUuid(), transaction);
    }

    public Transaction getById(UUID uuid) throws  TransactionNotFound{
        Transaction res = inMemoryStorage.get(uuid);
        if (res == null){
            throw new TransactionNotFound("Transaction not found");
        }
        return res;
    }

    public void update(UUID uuid, Transaction transaction) {
        inMemoryStorage.remove(uuid);
        inMemoryStorage.put(uuid, transaction);
    }

    public void delete(Transaction transaction) {
    inMemoryStorage.remove(transaction.getUuid());

    }

    public Collection<Transaction> getAll() {
        return inMemoryStorage.values();
    }
}
