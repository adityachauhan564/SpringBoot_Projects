package com.gfg.showtime.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gfg.showtime.domain.TheaterSeats;

@Repository
public interface TheaterSeatsRepository extends JpaRepository<TheaterSeats, Long> {

}