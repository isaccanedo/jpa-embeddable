package com.isaccanedo.jpa.repository;

import com.isaccanedo.jpa.model.Name;
import com.isaccanedo.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    List<User> findByName(Name name);

    List<User> findByNameFirstName(String firstName);

    List<User> findByAddressCountry(String country);
}
