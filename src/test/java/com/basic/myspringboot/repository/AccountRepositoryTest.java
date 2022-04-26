//package com.basic.myspringboot.repository;
//
//import com.basic.myspringboot.entity.Account;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Optional;
//
//@SpringBootTest
//public class AccountRepositoryTest {
//    @Autowired
//    AccountRepository accountRepository;
//
//    @Test   //Ctrl + Shift + F10
//    @Disabled
//    public void crud() throws Exception {
//        // 1. Create
//        Account account = new Account();    // 객체 생성
//        account.setUsername("spring");
//        account.setPassword("1234");
//        Account savedAccount = accountRepository.save(account); // 계정 등록요청
//        System.out.println("ID  " + savedAccount.getId());
//        System.out.println("username  " + savedAccount.getUsername());
//    }
//
//
//    @Test @Disabled
//    public void finder() throws Exception {
//        // Ctrl + Alt + V
//        Optional<Account> optional = accountRepository.findById(1L);
//        if(optional.isPresent()) {
//            Account account = optional.get();
//            System.out.println("Account: " + account.getUsername());
//        }
//
//        Account ac = accountRepository.findById(1L).orElse(new Account());
//        System.out.println("Account: " + ac.getUsername());
//
//        Account act = accountRepository.findById(2L).orElseGet(() -> new Account(""));
//        System.out.println("act.getUsername() => " + act.getUsername());
//
//        // Account acct = accountRepository.findById(3L).orElseThrow(() -> new RuntimeException("Account Not Found"));
//    }
//}
