package edu.market.auto.models;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<Car, Long> {
    //List<User> getUser();
    
}
