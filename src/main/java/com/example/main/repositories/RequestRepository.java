package com.example.main.repositories;

import com.example.main.models.RequestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<RequestModel, Integer> {
}
