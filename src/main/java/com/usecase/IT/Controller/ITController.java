package com.usecase.IT.Controller;

import com.usecase.IT.Entity.IT;
import com.usecase.IT.Service.ITService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class ITController {
    @Autowired
    private ITService itService;

    @PostMapping
    public IT createTicket(@RequestBody IT it) {
        return itService.createTicket(it);
    }


    @GetMapping
    public List<IT> getAllTickets(){
        return itService.getAllBills();
    }

    @GetMapping("/{id}")
    public IT getTicketById(@PathVariable Long id){
        return itService.getTicketById(id);
    }

}
