package com.usecase.IT.Repository;

import com.usecase.IT.Entity.IT;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ITRepository extends JpaRepository<IT, Long> {
    // Additional query methods can be defined here if needed
}
