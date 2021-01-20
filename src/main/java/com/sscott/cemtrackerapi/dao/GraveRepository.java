package com.sscott.cemtrackerapi.dao;

import com.sscott.cemtrackerapi.models.Grave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GraveRepository extends JpaRepository<Grave, Long> {
}
