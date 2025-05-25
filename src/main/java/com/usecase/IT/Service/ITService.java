package com.usecase.IT.Service;

import com.usecase.IT.Entity.IT;
import com.usecase.IT.Repository.ITRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ITService {
    @Autowired
    private ITRepository itRepository;

    public IT createTicket(IT it) {
        return itRepository.save(it);
    }

    public List<IT> getAllTickets() {
        return itRepository.findAll();
    }

    public IT getTicketById(Long id) {
        return itRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found with id: " + id));
    }
}
