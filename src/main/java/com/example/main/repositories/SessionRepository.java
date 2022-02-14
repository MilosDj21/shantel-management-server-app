package com.example.main.repositories;

import com.example.main.models.SessionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<SessionModel, Integer> {
}
