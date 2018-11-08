package com.rshekhmametyev.musicstorage.repositories;

import com.rshekhmametyev.musicstorage.entities.Genre;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface GenreRepository extends CrudRepository<Genre, UUID> {
}
