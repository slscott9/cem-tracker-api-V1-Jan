package com.sscott.cemtrackerapi.service;

import com.sscott.cemtrackerapi.dao.CemeteryRepository;
import com.sscott.cemtrackerapi.models.Cemetery;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CemeteryService {

    @Autowired
    CemeteryRepository cemeteryRepository;



    public List<Cemetery> allCemeteries() {
        return cemeteryRepository.findAll();
    }

    public Optional<Cemetery> getById(Long cemId) {
        return cemeteryRepository.findById(cemId);
    }

    public Cemetery saveCemetery(Cemetery cemetery) {
        return cemeteryRepository.save(cemetery);
    }

}
