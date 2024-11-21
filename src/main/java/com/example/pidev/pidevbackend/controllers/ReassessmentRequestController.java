package com.example.pidev.pidevbackend.controllers;

import com.example.pidev.pidevbackend.entities.RepassageRequest;
import com.example.pidev.pidevbackend.services.IRepassageRequestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@AllArgsConstructor
@RequestMapping("/reassessmentrequest")
@CrossOrigin("*")
public class ReassessmentRequestController {
    IRepassageRequestService service;

    @GetMapping("/retrieve-all")
    @ResponseBody
    public List<RepassageRequest> getRequests(){
        return  service.retrieveAllRequests();
    }
    @PostMapping("/add")
    @ResponseBody
    public RepassageRequest addRequest (@RequestBody RepassageRequest r){
        return service.addRequest(r);
    }
    @DeleteMapping("/delete-request/{id}")
    @ResponseBody
    public void deleteRequest(@PathVariable("id") Long id){

        service.deleteRequest(id);
    }
    @PutMapping("/update")
    @ResponseBody
    public RepassageRequest updateRequest(@RequestBody RepassageRequest r){

        return service.updateRequest(r);
    }
    @GetMapping("/retrieve/{id}")
    @ResponseBody
    public RepassageRequest retreiveRequestById(@PathVariable("id") Long id){

        return service.retrieveRequest(id);
    }
}
