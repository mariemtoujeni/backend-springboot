package com.example.pidev.pidevbackend.controllers;

import com.example.pidev.pidevbackend.entities.Offer;
import com.example.pidev.pidevbackend.services.IOfferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/offers")
@AllArgsConstructor
public class OfferController {

    private final IOfferService offerService;

    @PostMapping("/add")
    public Offer addOffer(@RequestBody Offer o) {

        return offerService.addOffer(o);
    }

    @DeleteMapping("/delete")
    public void deleteOffer(@RequestBody Offer o) {
        offerService.deleteOffer(o);
    }

    @PutMapping("/update")
    public void updateOffer(@RequestBody Offer o) {
        offerService.updateOffer(o);
    }

    @GetMapping("/{id}")
    public Offer getOffer(@PathVariable long id) {
        return offerService.getOffer(id);
    }

    @GetMapping("/all")
    public List<Offer> getAllOffer() {
        return offerService.getAllOffer();
    }
}
