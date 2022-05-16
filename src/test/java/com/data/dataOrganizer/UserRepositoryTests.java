package com.data.dataOrganizer;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import Login.Users;
import Login.UsersRepository;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UsersRepository repo;
     
    // test methods go below
    
    @Test
    public void testCreateUsers() {
        Users users = new Users();
        users.setUsername("ravikumar@gmail.com");
        users.setPassword("ravi2020");
        users.setFirstName("Ravi");
        users.setLastName("Kumar");
         
        Users savedUsers = repo.save(users);
         
        Users existUsers = entityManager.find(Users.class, savedUsers.getId());
         
        assertThat(users.getUsername()).isEqualTo(existUsers.getUsername());
         
    }
}
