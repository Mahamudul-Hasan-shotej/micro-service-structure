package com.example.movieratingservice.resources;

import com.example.movieratingservice.models.Rating;
import com.example.movieratingservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

//    @RequestMapping("/{movieId}")
//    public Rating getRating(@PathVariable("movieId") String movieId){
//        return new Rating(movieId,"4");
//    }

    @RequestMapping("users/{userId}")
    public UserRating getRating(@PathVariable("userId") String movieId){

        List<Rating> ratings =  Arrays.asList(
                new Rating("1234","3"),
                new Rating("5678","2")
        );
        UserRating userRating = new UserRating();
        userRating.setUserRatings(ratings);
        return userRating;
    }

}
