package io.javabrains.moviecatalogservice.resources;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.javabrains.moviecatalogservice.models.UserRating;

//@FeignClient(name="rating-proxy", url="http://localhost:8083/ratingsdata")
@RibbonClient
@FeignClient("ratings-data-service")

public interface RatingDataServiceProxy {
    @RequestMapping("/ratingsdata/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId);
    	
}
