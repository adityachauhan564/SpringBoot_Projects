package com.gfg.showtime.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gfg.showtime.domain.ShowSeat;

@Repository
public interface ShowSeatsRepository extends JpaRepository<ShowSeat, Long> {

}