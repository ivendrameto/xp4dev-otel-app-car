package dev.xp4.article.controller;

import dev.xp4.article.dto.CarDTO;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import dev.xp4.article.service.CarService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService service;

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public List<CarDTO> find(@RequestParam Map<String, String> allFilters) {
        return service.find(allFilters);
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CarDTO findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

}
