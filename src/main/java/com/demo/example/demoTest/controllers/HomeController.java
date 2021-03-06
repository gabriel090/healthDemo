package com.demo.example.demoTest.controllers;


import com.demo.example.demoTest.payloads.DiagnosisResponse;
import com.demo.example.demoTest.payloads.SpecializationResponse;
import com.demo.example.demoTest.payloads.SysmptomsResponse;
import com.demo.example.demoTest.services.DiagService;
import com.demo.example.demoTest.services.SpecializeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HomeController {
    @Autowired
    DiagService diagService;
    SpecializeService specializeService;
   /// The controller class is responsible for processing incoming RESTFul API request
    //are used to return view to be rendered as a response
    //@RequestMapping are annotations which mark classes as a request to handler to allow Spring
    // recognize it as RESTful service during runtime

    @RequestMapping("/home")
    public Flux<SysmptomsResponse> home() {
        return diagService.getSymptoms();
    }

    @RequestMapping("/diag")
    public Flux<DiagnosisResponse> diag(@RequestParam String symptoms,
                                        @RequestParam String gender,
                                        @RequestParam String age){
        return diagService.getDiagnosis(symptoms,gender,age);
    }
    @RequestMapping("/special")
    public Flux<SpecializationResponse> special(@RequestParam String symptoms,
                                                @RequestParam String gender,
                                                @RequestParam String age){
        return specializeService.getSpecialization(symptoms,gender,age);
    }



}
