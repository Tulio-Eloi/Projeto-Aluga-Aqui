package com.alugaaqui.aluga_aqui.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alugaaqui.aluga_aqui.model.CarrosModel;

public interface CarrosRepositories extends  JpaRepository<CarrosModel, Long>{

    Optional<CarrosModel> findById(Long id_carros);
    
}
