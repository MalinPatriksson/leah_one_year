package org.example.leah_one_year.service;

import org.example.leah_one_year.models.RsvpRequest;
import org.example.leah_one_year.repo.RsvpRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RsvpRequestService {

    private final RsvpRequestRepo rsvpRepository;

    @Autowired
    public RsvpRequestService(RsvpRequestRepo rsvpRepository) {
        this.rsvpRepository = rsvpRepository;
    }

    public void saveRsvp(RsvpRequest rsvp) {
        rsvpRepository.save(rsvp);
    }

    public Iterable<RsvpRequest> getAllRsvps() {
        return rsvpRepository.findAll();
    }

    public void processRsvp(RsvpRequest rsvp) {
        sendConfirmationEmail(rsvp);
    }

    private void sendConfirmationEmail(RsvpRequest rsvp) {
    }
}

