package com.nike_clone.backend_nike.repository;

import com.nike_clone.backend_nike.model.T_shirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface T_ShirtRepository extends JpaRepository<T_shirt, UUID> {
}
