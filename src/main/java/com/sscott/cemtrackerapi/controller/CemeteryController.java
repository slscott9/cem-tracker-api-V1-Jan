package com.sscott.cemtrackerapi.controller;

import com.sscott.cemtrackerapi.models.Cemetery;
import com.sscott.cemtrackerapi.service.CemeteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api") //  /api/v1/ puts / automatically
public class CemeteryController {

    @Autowired
    CemeteryService cemeteryService;

    @GetMapping("v1/cemeteries")
    public ResponseEntity<List<Cemetery>> allCemeteries() {
        return new ResponseEntity<>(cemeteryService.allCemeteries(), HttpStatus.OK);
    }
}
