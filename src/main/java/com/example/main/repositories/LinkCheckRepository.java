package com.example.main.repositories;

import com.example.main.models.LinkCheckModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkCheckRepository extends JpaRepository<LinkCheckModel, Long> {
}
