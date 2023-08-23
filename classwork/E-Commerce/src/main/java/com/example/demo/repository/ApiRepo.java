package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ApiModel;

@Repository//represents repository
public interface ApiRepo extends JpaRepository<ApiModel, Integer>{

}
