package com.gfg.showtime.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gfg.showtime.domain.Ticket;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{

}