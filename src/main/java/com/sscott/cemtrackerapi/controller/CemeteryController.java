package com.sscott.cemtrackerapi.controller;

import com.sscott.cemtrackerapi.dto.CemeteryDto;
import com.sscott.cemtrackerapi.dto.mapper.ModelMapper;
import com.sscott.cemtrackerapi.models.Cemetery;
import com.sscott.cemtrackerapi.service.CemeteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api") //  /api/v1/ puts / automatically
public class CemeteryController extends ModelMapper {

    @Autowired
    CemeteryService cemeteryService;

    @GetMapping("v1/cemeteries")
    public ResponseEntity<List<CemeteryDto>> allCemeteries() {
        return new ResponseEntity<List<CemeteryDto>>(
                mapList(cemeteryService.allCemeteries(), CemeteryDto.class),
                HttpStatus.OK
        );
    }

    @GetMapping("v1/cemeteries/{userName}")
    public ResponseEntity<List<CemeteryDto>> userCemeteries(@PathVariable String userName) {

        List<Cemetery> cemeteryList = cemeteryService.userCemeteries(userName);

        return new ResponseEntity<>(mapList(cemeteryList, CemeteryDto.class), HttpStatus.OK);
    }

    @PostMapping("/v1/cemetery")
    @ResponseBody
    public ResponseEntity<CemeteryDto> addCemetery(@RequestBody CemeteryDto cemeteryDto) {

        Cemetery cemetery = cemeteryService.saveCemetery(cemeteryService.saveCemetery(map(cemeteryDto,Cemetery.class)));
        return new ResponseEntity<CemeteryDto>(map(cemetery, CemeteryDto.class), HttpStatus.OK) ;
    }

    @GetMapping("v1/cemetery/{id}")
    @ResponseBody
    public ResponseEntity<CemeteryDto> getCemetery(@PathVariable Long id) {

        System.out.print("CEMETERY ID IS  " + id);

        Optional<Cemetery> cemetery = cemeteryService.getCemWithId(id);



        return new ResponseEntity<>(map(cemetery.get(), CemeteryDto.class), HttpStatus.OK); //MUST USE get() when repo returns optional
    }
//llll


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

    @GetMapping("/v1/cemetery/search/{query}")
    public ResponseEntity<Cemetery> searchCemeteries(@PathVariable String query){
        List<Cemetery> cemeteryList = cemeteryService.searchCemeteries(query);

        return new ResponseEntity(mapList(cemeteryList, CemeteryDto.class), HttpStatus.OK);
    }
}
