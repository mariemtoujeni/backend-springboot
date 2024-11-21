package com.example.pidev.pidevbackend.services;



import com.example.pidev.pidevbackend.entities.Offer;

import java.util.List;

public interface IOfferService {
    public Offer addOffer (Offer o);
    public void deleteOffer(Offer o);
    public void updateOffer(Offer o);
    public Offer getOffer(long id );
    public List<Offer> getAllOffer();
}
