package io.javabrains.moviecatalogservice.resources;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import io.javabrains.moviecatalogservice.models.Movie;

//@FeignClient(name="movie-info-proxy", url="http://localhost:8082/movies")
@RibbonClient
@FeignClient("movie-info-service")
public interface MovieInfoServiceProxy {
    @RequestMapping("/movies/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId);
    	
    
}
