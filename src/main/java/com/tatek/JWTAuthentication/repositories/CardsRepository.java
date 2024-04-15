package com.tatek.JWTAuthentication.repositories;

import com.tatek.JWTAuthentication.entities.Cards;
import com.tatek.JWTAuthentication.entities.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {
    List<Cards> findByCustomerId(int customerId);

}
