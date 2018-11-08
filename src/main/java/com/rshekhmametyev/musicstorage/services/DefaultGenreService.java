package com.rshekhmametyev.musicstorage.services;

import com.google.common.collect.Lists;
import com.rshekhmametyev.musicstorage.entities.Genre;
import com.rshekhmametyev.musicstorage.repositories.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultGenreService implements GenreService {
    private final GenreRepository genreRepository;

    public DefaultGenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public List<Genre> get() {
        return Lists.newArrayList(genreRepository.findAll());
    }
}
