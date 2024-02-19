package dev.xp4.article.mapper;

import dev.xp4.article.dto.CarDTO;

import dev.xp4.article.persistence.entity.Car;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CarMapper {

    List<CarDTO> toListDTO(List<Car> entity);
    CarDTO toDTO(Car entity);

}
