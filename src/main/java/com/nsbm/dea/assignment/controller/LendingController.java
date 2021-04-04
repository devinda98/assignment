package com.nsbm.dea.assignment.controller;

import com.nsbm.dea.assignment.model.Lend;
import com.nsbm.dea.assignment.service.LendService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LendingController {
    LendService lendService;
/*
    @GetMapping("/lending-status/user/{id}")
    public String CheckLendingStatusByUser(	@PathVariable("id") Integer id,
                                              Lend lend) {
        paid = lendService.makePayment(id);

        String message = !paid ? "Not all books are returned to the library. Return all the books so we could proceed with payments." : null;
        model.addAttribute("message", message);
        model = this.addModelsToUserDetailedPage(model, id, null);
        return "user-details";
    }

 */
}
