package com.rshekhmametyev.musicstorage.services;

import com.rshekhmametyev.musicstorage.entities.Genre;

import java.util.List;
import java.util.UUID;

public interface GenreService {
    List<Genre> get();

    UUID add(Genre genre);
}
