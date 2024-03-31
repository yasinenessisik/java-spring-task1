package com.javaspringtask1.javaspringtask1.dto.converter;

import com.javaspringtask1.javaspringtask1.dto.TransactionDto;
import com.javaspringtask1.javaspringtask1.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDtoConverter {

    public TransactionDto convert(Transaction from){
        return new TransactionDto(
                from.getId(),
                from.getAmount(),
                from.getTransactionTime(),
                from.getTransactionStat()
                );
    }
}
