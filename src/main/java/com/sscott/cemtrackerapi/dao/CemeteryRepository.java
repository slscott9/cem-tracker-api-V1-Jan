package com.sscott.cemtrackerapi.dao;

import com.sscott.cemtrackerapi.models.Cemetery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CemeteryRepository  extends JpaRepository<Cemetery, Long> {


}
