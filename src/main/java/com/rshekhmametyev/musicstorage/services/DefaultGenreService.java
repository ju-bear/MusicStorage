package com.rshekhmametyev.musicstorage.services;

import com.google.common.collect.Lists;
import com.rshekhmametyev.musicstorage.entities.Genre;
import com.rshekhmametyev.musicstorage.repositories.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DefaultGenreService implements GenreService {
    private final GenreRepository genreRepository;

    public DefaultGenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public List<Genre> get() {
        return Lists.newArrayList(this.genreRepository.findAll());
    }

    @Override
    public UUID add(Genre genre) {
        if (genre == null) {
            throw new IllegalArgumentException("Genre cannot be null");
        }

        UUID id = UUID.randomUUID();
        genre.setId(id);

        this.genreRepository.save(genre);
        return id;
    }

    @Override
    public boolean delete(UUID id) {
        if (!this.genreRepository.existsById(id)) {
            return false;
        }

        this.genreRepository.deleteById(id);
        return true;
    }
}
