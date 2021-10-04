package com.example.cricketerjpatest.repo;

import com.example.cricketerjpatest.entity.Cricketer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CricketerRepository extends JpaRepository<Cricketer, Long> {
    List<Cricketer> findByLastName(String lastName);
    Cricketer findById(long id);
}
