package com.sscott.cemtrackerapi.controller;

import com.sscott.cemtrackerapi.dto.GraveDto;
import com.sscott.cemtrackerapi.models.Cemetery;
import com.sscott.cemtrackerapi.models.Grave;
import com.sscott.cemtrackerapi.service.GraveService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class GraveController extends com.sscott.cemtrackerapi.dto.mapper.ModelMapper {

    @Autowired
    GraveService graveService;


    @PostMapping("v1/grave")
    ResponseEntity<GraveDto> addGrave(@RequestBody  GraveDto graveDto) {
        Grave grave =  graveService.addGrave(map(graveDto, Grave.class));

        return new ResponseEntity<>(map(grave, GraveDto.class), HttpStatus.OK);
    }

    @PostMapping("v1/graves/add")
    ResponseEntity<List<Grave>> syncGraves(@RequestBody List<GraveDto> graveDtoList){

        List<Grave> savedGraves = graveService.syncGraves(mapList(graveDtoList, Grave.class));

        return new ResponseEntity(mapList(savedGraves, GraveDto.class), HttpStatus.OK);
    }

//    @GetMapping("v1/grave/{cemId}")
//    ResponseEntity<List<GraveDto>> getGraves(@PathVariable("cemId") Long cemId){
//
//    }


}
