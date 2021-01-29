package com.sscott.cemtrackerapi.service;

import com.sscott.cemtrackerapi.dao.CemeteryRepository;
import com.sscott.cemtrackerapi.dao.GraveRepository;
import com.sscott.cemtrackerapi.models.Cemetery;
import com.sscott.cemtrackerapi.models.Grave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CemeteryService {

    @Autowired
    CemeteryRepository cemeteryRepository;

    @Autowired
    GraveRepository graveRepository;

    public List<Cemetery> allCemeteries() {
        return cemeteryRepository.findAll();
    }

    public Optional<Cemetery> getById(Long cemId) {
        return cemeteryRepository.findById(cemId);
    }

    public Cemetery saveCemetery(Cemetery cemetery) {
        return cemeteryRepository.save(cemetery);
    }

    public Long getMostRecentTimeAdded() {return cemeteryRepository.getMostRecentTime();}

    public List<Cemetery> saveCemeteries(List<Cemetery> cemeteryList) {

        for(Cemetery cemetery : cemeteryList){

            assert cemetery.getGraves() != null;
            for(Grave grave : cemetery.getGraves()){
                grave.setCemetery(cemetery); //set graves cemetery field for one to many relationship
            }
        }
        return cemeteryRepository.saveAll(cemeteryList);

    }

    public Optional<Cemetery> getCemWithId(Long id) {

        //MUST USE get() when repo returns optional in this case use get() in the controller

        Optional<Cemetery> cemetery = cemeteryRepository.findById(id);
        return cemetery;
    }

    public List<Cemetery> userCemeteries(String userName) {
        return cemeteryRepository.getUserCemeteries(userName);
    }

    public List<Cemetery> searchCemeteries(String query) {
        return cemeteryRepository.searchCemeteries(query);
    }

}
