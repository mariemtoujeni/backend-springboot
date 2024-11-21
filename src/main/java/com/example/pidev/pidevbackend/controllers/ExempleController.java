package com.example.pidev.pidevbackend.controllers;

import com.example.pidev.pidevbackend.entities.Exemple;
import com.example.pidev.pidevbackend.services.IExempleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/exemple")
public class ExempleController {
    private IExempleService iExempleService;

    @GetMapping("/get")
    public Exemple getExemple() {
        return iExempleService.getExemple();
    }
    @GetMapping("/add")
    public String addExemple() {
        return "Exemple added";
    }

}
