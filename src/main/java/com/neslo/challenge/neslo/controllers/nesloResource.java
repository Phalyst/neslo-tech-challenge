package com.neslo.challenge.neslo.controllers;


import com.neslo.challenge.neslo.exceptionHandling.InvalidInputException;
import com.neslo.challenge.neslo.models.MathsCommand;
import com.neslo.challenge.neslo.models.MathsResponse;
import com.neslo.challenge.neslo.services.MathsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class nesloResource {


    @Autowired
    private MathsService mathsService;

   @PostMapping("/mathematicalEquation")
    public ResponseEntity<MathsResponse> mathematicalEquation(@RequestBody MathsCommand request) throws Exception {

       MathsResponse response = new MathsResponse();
       response.setResults( mathsService.processMathsEquation(request));
       return ResponseEntity.ok(response);
    }
}