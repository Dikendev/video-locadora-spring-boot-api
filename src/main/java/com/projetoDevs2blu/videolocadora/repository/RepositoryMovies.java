package com.projetoDevs2blu.videolocadora.repository;


import com.projetoDevs2blu.videolocadora.models.LocadoraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositoryMovies extends JpaRepository<LocadoraModel, UUID>{

    boolean existsByFilmeNome(String filmeNome);
}
