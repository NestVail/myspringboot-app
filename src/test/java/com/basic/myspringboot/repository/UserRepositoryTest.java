package com.basic.myspringboot.repository;

import com.basic.myspringboot.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void create() throws Exception {
        User user = new User();
        user.setName("Gildong Hong");
        user.setEmail("abc@def.com");
        User saveUser = userRepository.save(user);
        System.out.println("Name: " + saveUser.getName());
        System.out.println("Email: " + saveUser.getEmail());
    }
}
