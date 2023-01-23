package com.projetoDevs2blu.videolocadora.controllers;

import com.projetoDevs2blu.videolocadora.Dtos.MovieDto;
import com.projetoDevs2blu.videolocadora.Services.MovieService;
import com.projetoDevs2blu.videolocadora.models.LocadoraModel;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/movie-aluguel")
public class MovieController {

    final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<Object> saveMovie(@RequestBody @Valid MovieDto movieDto){

        //terminar
        if(movieService.existsByFilmeNome(movieDto.getFilmeNome())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("filme alugado por outro usuario");
        }


        var locadoraModel =  new LocadoraModel();
        BeanUtils.copyProperties(movieDto, locadoraModel);
        locadoraModel.setDataAluguel(LocalDateTime.now(ZoneId.of("UCT")));
        return ResponseEntity.status(HttpStatus.CREATED).body(movieService.save(locadoraModel));
    }

}
