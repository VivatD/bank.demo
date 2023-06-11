package com.bank.example.bank.demo.service.bankService;

import com.bank.example.bank.demo.model.bank.Bank;
import com.bank.example.bank.demo.repository.BankRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BankServiceImpl implements BankService {
    @Autowired
    private BankRepository bankRepository;

    // trebi de modificat
//    public  void addFunds(long amuons, String currency){
//        if(currency.equals("MDL")){
//             bank.setBalanceMDL(bank.getBalanceMDL()+ amuons);
//        } else if (currency.equals("USD")) {
//            bank.setBalanceUSD(bank.getBalanceUSD()+ amuons);
//        } else if (currency.equals("EURO")) {
//            bank.setBalanceEUR(bank.getBalanceEUR()+ amuons);
//        } else if (currency.equals("RON")) {
//            bank.setBalanceRON(bank.getBalanceRON()+ amuons);
//        }
//    }
//    public void withdrawFunds(long amouns, String currency){
//        if(currency.equals("MDL")){
//            bank.setBalanceMDL(bank.getBalanceMDL() - amouns);
//        } else if (currency.equals("USD")) {
//            bank.setBalanceUSD(bank.getBalanceUSD() - amouns);
//        } else if (currency.equals("EURO")) {
//            bank.setBalanceEUR(bank.getBalanceEUR() - amouns);
//        } else if (currency.equals("RON")) {
//            bank.setBalanceRON(bank.getBalanceRON() - amouns);
//        }
//
//    }

    @Override
    public void addBank(Bank bank) {
        //TODO: exemplu
        System.out.println("service to add bank central");
        bankRepository.save(bank);
    }

    @Override
    public List<Bank> loadAllBank() {
        //TODO: exmplu
        System.out.println("service load all bank");
        return bankRepository.findAll();
    }

    @Override
    public List<Bank> findBankByName(String name) {
        //TODO: trebui de implimentat
        return null;
    }

    @Override
    public List<Bank> findBankByAddress(String address) {
        //TODO: trebui de implimentat
        return null;
    }

    @Override
    public void deleteBankByID(long id) {
        //TODO: trebui de implimentat

    }

    @Override
    public void updateBank(Bank bank) {
        //TODO: trebui de implimentat
    }
}
