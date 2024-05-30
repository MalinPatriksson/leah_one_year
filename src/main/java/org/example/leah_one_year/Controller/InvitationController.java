package org.example.leah_one_year.Controller;

import org.example.leah_one_year.models.RsvpRequest;
import org.example.leah_one_year.service.RsvpRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InvitationController {

    @Autowired
    private final RsvpRequestService rsvpRequestService;

    public InvitationController(RsvpRequestService rsvpRequestService) {
        this.rsvpRequestService = rsvpRequestService;
    }

    @GetMapping("/invitation")
    public String showInvitation(Model model) {
        model.addAttribute("invitationMessage", "Till vår fest den 13 juni 2024");
        model.addAttribute("rsvpButtonId", "rsvpButton");
        model.addAttribute("rsvpButtonText", "OSA här");
        model.addAttribute("showModal", true);
        return "index";
    }

    @PostMapping("/rsvp")
    public String saveRsvp(RsvpRequest rsvpRequest, Model model) {
        rsvpRequestService.saveRsvp(rsvpRequest);
        model.addAttribute("confirmationMessage", "Tack för att du svarade!");
        return "confirmation";
    }
}
