package com.sscott.cemtrackerapi.service;

import com.sscott.cemtrackerapi.dao.CemeteryRepository;
import com.sscott.cemtrackerapi.dao.GraveRepository;
import com.sscott.cemtrackerapi.models.Cemetery;
import com.sscott.cemtrackerapi.models.Grave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class GraveService {

    @Autowired
    GraveRepository graveRepository;

    @Autowired
    CemeteryRepository cemeteryRepository;

    public Grave addGrave(Grave grave) {

        Optional<Cemetery> cemetery = cemeteryRepository.findById(grave.getCemId());

        grave.setCemetery(cemetery.get());

        return graveRepository.save(grave);
    }

    public List<Grave> syncGraves(List<Grave> graveList){
        for(Grave grave : graveList){
             Optional<Cemetery>  cemetery = cemeteryRepository.findById(grave.getCemId());

             grave.setCemetery(cemetery.get());
        }
        return graveRepository.saveAll(graveList);
    }
//    public List<Grave> getGraves(Long cemId) {
//        return graveRepository.findAllById(cemId)
//    }
}
