package com.gfg.showtime.resource;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.gfg.showtime.enums.Genre;


@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class MovieResource {

	private long id;

	private String title;

	private Genre genre;

	private List<ReviewResource> reviews;

}