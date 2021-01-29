package com.sscott.cemtrackerapi.dao;

import com.sscott.cemtrackerapi.models.Cemetery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CemeteryRepository  extends JpaRepository<Cemetery, Long> {


    @Query(value = "SELECT MAX(epochTimeAdded) from Cemetery")
    public Long getMostRecentTime();

    //use nativeQuery for statements with parameters
    @Query(value = "SELECT * FROM Cemetery c  WHERE c.added_by = :userName", nativeQuery = true)
    public List<Cemetery> getUserCemeteries( String userName);

    @Query(value = "SELECT * FROM Cemetery c WHERE name like %:query%", nativeQuery = true)
    public List<Cemetery> searchCemeteries(String query);



}
