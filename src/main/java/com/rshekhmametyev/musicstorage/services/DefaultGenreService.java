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
        UUID id = UUID.randomUUID();
        genre.setId(id);

        this.genreRepository.save(genre);
        return id;
    }
}
