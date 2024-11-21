package com.example.pidev.pidevbackend.services.Implementation;



import com.example.pidev.pidevbackend.entities.Offer;
import com.example.pidev.pidevbackend.repositories.OfferRepository;
import com.example.pidev.pidevbackend.services.IOfferService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;





@Service
@AllArgsConstructor
public class OfferServiceImpl implements IOfferService {
    private final OfferRepository offerRepository;

    @Override
    public Offer addOffer(Offer o) {
        return offerRepository.save(o);
    }

    @Override
    public void deleteOffer(Offer o) {
        offerRepository.delete(o);
    }

    @Override
    public void updateOffer(Offer o) {
        offerRepository.save(o);
    }

    @Override
    public Offer getOffer(long id) {
        return offerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Offer> getAllOffer() {
        return offerRepository.findAll();
    }
}