package com.nike_clone.backend_nike.repository;

import com.nike_clone.backend_nike.model.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, UUID> {
}
