package com.nike_clone.backend_nike.repository;

import com.nike_clone.backend_nike.model.Track_Pant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Track_PantRepository extends JpaRepository<Track_Pant, UUID> {
}
