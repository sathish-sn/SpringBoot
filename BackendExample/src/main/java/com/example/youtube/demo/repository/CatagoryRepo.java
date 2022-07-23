package com.example.youtube.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.youtube.demo.entities.Catagory;

public interface CatagoryRepo extends JpaRepository<Catagory, Integer>  {

}
