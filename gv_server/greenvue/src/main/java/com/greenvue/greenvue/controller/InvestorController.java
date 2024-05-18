package com.greenvue.controller;

import com.greenvue.model.Investor;
import com.greenvue.repository.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/investors")
public class InvestorController {
    @Autowired
    private InvestorService investorService;

    @GetMapping
    public List<Investor> getAllInvestors() {
        return investorRepository.findAll();
    }

    @PostMapping
    public Investor createInvestor(@RequestBody Investor investor) {
        return investorService.createInvestor(investor);
    }

    // Other CRUD methods
}