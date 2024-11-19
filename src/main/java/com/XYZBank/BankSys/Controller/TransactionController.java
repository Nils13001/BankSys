package com.XYZBank.BankSys.Controller;

import com.XYZBank.BankSys.Entity.TransactionEntity;
import com.XYZBank.BankSys.Service.BankStatement;
import com.itextpdf.text.DocumentException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/transaction")
@AllArgsConstructor
public class TransactionController {

    private BankStatement bankStatement;

    @GetMapping("/bankStatement")
    public List<TransactionEntity> generateBankStatement(@RequestParam String accountNumber,
                                                         @RequestParam String startDate,
                                                         @RequestParam String endDate) throws DocumentException, FileNotFoundException {
        return bankStatement.generateStatement(accountNumber, startDate, endDate);
    }

}
