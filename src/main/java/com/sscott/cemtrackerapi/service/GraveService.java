package com.sscott.cemtrackerapi.service;

import com.sscott.cemtrackerapi.dao.GraveRepository;
import com.sscott.cemtrackerapi.models.Grave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GraveService {

    @Autowired
    GraveRepository graveRepository;

    public Grave addGrave(Grave grave) {
        return graveRepository.save(grave);
    }
}
