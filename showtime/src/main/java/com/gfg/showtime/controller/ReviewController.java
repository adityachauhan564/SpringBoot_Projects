package com.gfg.showtime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gfg.showtime.domain.Review;
import com.gfg.showtime.resource.ReviewResource;
import com.gfg.showtime.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/add")
    public void addReview(@RequestBody ReviewResource reviewRequest){
        reviewService.addReview(Review.toEntity(reviewRequest));
    }

    @GetMapping("/find")
    public ReviewResource getReview(@RequestParam Long reviewId){
        return reviewService.getReviewById(reviewId);
    }
}
