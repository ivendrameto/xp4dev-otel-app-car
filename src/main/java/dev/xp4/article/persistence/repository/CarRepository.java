package dev.xp4.article.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.xp4.article.persistence.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
