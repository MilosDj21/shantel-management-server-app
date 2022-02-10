package com.example.main.repositories;

import com.example.main.models.LinkModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<LinkModel, Integer> {
}
