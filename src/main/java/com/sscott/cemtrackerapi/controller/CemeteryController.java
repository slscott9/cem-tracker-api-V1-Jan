package com.sscott.cemtrackerapi.controller;

import com.sscott.cemtrackerapi.dto.CemeteryDto;
import com.sscott.cemtrackerapi.models.Cemetery;
import com.sscott.cemtrackerapi.service.CemeteryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") //  /api/v1/ puts / automatically
public class CemeteryController {

    @Autowired
    CemeteryService cemeteryService;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping("v1/cemeteries")
    public ResponseEntity<List<Cemetery>> allCemeteries() {
        return new ResponseEntity<>(cemeteryService.allCemeteries(), HttpStatus.OK);
    }

    @PostMapping("/v1/cemetery")
    @ResponseBody
    public ResponseEntity<CemeteryDto> addCemetery(@RequestBody CemeteryDto cemeteryDto) {

        Cemetery cemetery = cemeteryService.saveCemetery(cemeteryService.saveCemetery(cemDtoToCemetery(cemeteryDto)));
        return new ResponseEntity<CemeteryDto>(cemeteryToDto(cemetery), HttpStatus.OK) ;
    }

    public Cemetery cemDtoToCemetery(CemeteryDto cemeteryDto){
        return modelMapper.map(cemeteryDto, Cemetery.class);
    }

    public CemeteryDto cemeteryToDto(Cemetery cemetery){
        return modelMapper.map(cemetery, CemeteryDto.class);
    }
}
