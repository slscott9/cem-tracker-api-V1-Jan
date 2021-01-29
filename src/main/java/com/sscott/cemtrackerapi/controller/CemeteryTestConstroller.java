package com.sscott.cemtrackerapi.controller;


import com.sscott.cemtrackerapi.service.CemeteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //  /api/v1/ puts / automatically
public class CemeteryTestConstroller {

    @Autowired
    CemeteryService cemeteryService;

    /*
        Example end point returns all cemeteries and payload is too large for client the application will crash unless its using flows

        This rest api will also crash if too many users are requesting for all cemeteries (runs out of memory)

        Backpresher producer produces faster than consumer can consume

        Every endpoint so far uses inperative style of rest api.

        1. get cems 2. build a response 3. return it
     */


}
