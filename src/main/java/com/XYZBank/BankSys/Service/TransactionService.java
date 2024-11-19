package com.XYZBank.BankSys.Service;

import com.XYZBank.BankSys.Entity.TransactionEntity;
import com.XYZBank.BankSys.Model.TransactionModel;

public interface TransactionService {

    void saveTransaction(TransactionModel transactionModel);

}
