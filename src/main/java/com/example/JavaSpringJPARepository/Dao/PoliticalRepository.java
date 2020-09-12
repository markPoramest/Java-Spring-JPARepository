package com.example.JavaSpringJPARepository.Dao;

import com.example.JavaSpringJPARepository.model.Political;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoliticalRepository extends JpaRepository<Political,Integer> {



}
