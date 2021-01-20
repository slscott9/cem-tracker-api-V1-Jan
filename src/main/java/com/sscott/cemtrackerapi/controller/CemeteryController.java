package com.sscott.cemtrackerapi.controller;

import com.sscott.cemtrackerapi.dto.CemeteryDto;
import com.sscott.cemtrackerapi.dto.response.ServerResponse;
import com.sscott.cemtrackerapi.models.Cemetery;
import com.sscott.cemtrackerapi.service.CemeteryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping("v1/cemeteries/{userName}")
    public ResponseEntity<List<CemeteryDto>> userCemeteries(@PathVariable String userName) {

        List<Cemetery> cemeteryList = cemeteryService.userCemeteries(userName);

        return new ResponseEntity<>(mapList(cemeteryList, CemeteryDto.class), HttpStatus.OK);
    }

    @PostMapping("/v1/cemetery")
    @ResponseBody
    public ResponseEntity<CemeteryDto> addCemetery(@RequestBody CemeteryDto cemeteryDto) {

        Cemetery cemetery = cemeteryService.saveCemetery(cemeteryService.saveCemetery(cemDtoToCemetery(cemeteryDto)));
        return new ResponseEntity<CemeteryDto>(cemeteryToDto(cemetery), HttpStatus.OK) ;
    }

    @GetMapping("/v1/cemetery/sync")
    public ResponseEntity<Long> mostRecentInsert() {
        return new ResponseEntity<>(cemeteryService.getMostRecentTimeAdded(), HttpStatus.OK);
    }

    @PostMapping("/v1/cemeteries/add")
    public ResponseEntity<List<CemeteryDto>> addCemeteries(@RequestBody List<CemeteryDto> cemeteryDtoList) {
        List<Cemetery> cemeteryList = cemeteryService.saveCemeteries(
                mapList(cemeteryDtoList, Cemetery.class)
        );

        return new ResponseEntity<>(cemeteryDtoList, HttpStatus.OK);
    }


    public Cemetery cemDtoToCemetery(CemeteryDto cemeteryDto){
        return modelMapper.map(cemeteryDto, Cemetery.class);
    }

    public CemeteryDto cemeteryToDto(Cemetery cemetery){
        return modelMapper.map(cemetery, CemeteryDto.class);
    }

//    public List<Cemetery> cemeteryDtoToCemeteryList(List<CemeteryDto> cemeteryDtoList){
//        return modelMapper.map(cemeteryDtoList, Cemetery.class);
//    }

    <S, T> T map(S source, Class<T> targetClass) {
        return modelMapper.map(source, targetClass);
    }


    <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
        return source
                .stream()
                .map(element -> modelMapper.map(element, targetClass))
                .collect(Collectors.toList());
    }
}
