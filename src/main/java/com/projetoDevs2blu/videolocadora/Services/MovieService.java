package com.projetoDevs2blu.videolocadora.Services;

import jakarta.transaction.Transactional;
import com.projetoDevs2blu.videolocadora.models.LocadoraModel;
import org.springframework.stereotype.Service;
import com.projetoDevs2blu.videolocadora.repository.RepositoryMovies;

@Service
public class MovieService {
    final RepositoryMovies repositoryMovies;

    public MovieService(RepositoryMovies repositoryMovies) {
        this.repositoryMovies = repositoryMovies;
    }

    @Transactional
    public LocadoraModel save(LocadoraModel locadoraModel) {
        return repositoryMovies.save(locadoraModel);
    }

    public boolean existsByFilmeNome(String filmeNome) {
        return repositoryMovies.existsByFilmeNome(filmeNome);
    }

}
