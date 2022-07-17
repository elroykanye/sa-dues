package com.elroykanye.sadues.data.repository;

import com.elroykanye.sadues.data.entity.Executive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutiveRepository extends JpaRepository<Executive, Long> {
}
