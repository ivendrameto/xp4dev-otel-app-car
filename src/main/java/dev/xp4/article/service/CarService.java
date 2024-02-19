package dev.xp4.article.service;

import dev.xp4.article.dto.CarDTO;

import dev.xp4.article.mapper.CarMapper;
import dev.xp4.article.persistence.entity.Car;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import dev.xp4.article.persistence.repository.CarRepository;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository repository;
    private final CarMapper mapper;

    public List<CarDTO> find(Map<String, String> allFilters) {
        List<Car> list = repository.findAll();
        return mapper.toListDTO(list);
    }

    public CarDTO findById(Long id) {
        Car entity = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException(String.format("Car id [%s] not found!", id)));

        return mapper.toDTO(entity);
    }

}
