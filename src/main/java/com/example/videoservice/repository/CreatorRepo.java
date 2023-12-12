package com.example.videoservice.repository;

import com.example.videoservice.model.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepo extends JpaRepository<Creator,Integer> {
}
