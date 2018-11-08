package com.rshekhmametyev.musicstorage.repositories;

import com.rshekhmametyev.musicstorage.entities.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AuthorRepository extends CrudRepository<Author, UUID> {
    Iterable<Author> findByNickname(String nickname);
}