package com.gfg.showtime.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gfg.showtime.domain.Theater;


@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {

}