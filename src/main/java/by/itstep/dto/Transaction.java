package by.itstep.dto;

import lombok.*;
import java.util.UUID;
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString

@Data
@AllArgsConstructor
public class Transaction {
    private TransactionType transactionType;
    private UUID uuid;
    private Long amount;
    private TransactionResult transactionResult;

//  public Transaction(){
//        transactionType = TransactionType.DEBIT;
//        uuid = null;
//        amount = 0L;
//    }

//    public Transaction(TransactionType transactionType, UUID uuid, Long amount) {
//        this.transactionType = transactionType;
//        this.uuid = uuid;
//        this.amount = amount;
//    }

//    public TransactionType getTransactionType() {
//        return transactionType;
//    }
//
//    public void setTransactionType(TransactionType transactionType) {
//        this.transactionType = transactionType;
//    }
//
//    public UUID getUuid() {
//        return uuid;
//    }
//
//    public void setUuid(UUID uuid) {
//        this.uuid = uuid;
//    }
//
//    public Long getAmount() {
//        return amount;
//    }
//
//    public void setAmount(Long amount) {
//        this.amount = amount;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Transaction)) return false;
//
//        Transaction that = (Transaction) o;
//
//        if (getTransactionType() != that.getTransactionType()) return false;
//        if (getUuid() != null ? !getUuid().equals(that.getUuid()) : that.getUuid() != null) return false;
//        return getAmount() != null ? getAmount().equals(that.getAmount()) : that.getAmount() == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = getTransactionType() != null ? getTransactionType().hashCode() : 0;
//        result = 31 * result + (getUuid() != null ? getUuid().hashCode() : 0);
//        result = 31 * result + (getAmount() != null ? getAmount().hashCode() : 0);
//        return result;
//    }
}
