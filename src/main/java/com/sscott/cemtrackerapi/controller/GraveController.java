package com.sscott.cemtrackerapi.controller;

import com.sscott.cemtrackerapi.dto.GraveDto;
import com.sscott.cemtrackerapi.models.Cemetery;
import com.sscott.cemtrackerapi.models.Grave;
import com.sscott.cemtrackerapi.service.GraveService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class GraveController {

    @Autowired
    GraveService graveService;

    @Autowired
    ModelMapper modelMapper;

    @RequestMapping("v1/grave")
    ResponseEntity<GraveDto> addGrave(@RequestBody  GraveDto graveDto) {
        Grave grave =  graveService.addGrave(map(graveDto, Grave.class));

        return new ResponseEntity<>(map(grave, GraveDto.class), HttpStatus.OK);
    }

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
