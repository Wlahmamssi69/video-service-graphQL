package com.example.videoservice.repository;

import com.example.videoservice.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepo extends JpaRepository<Video,Integer> {
}
