package com.rshekhmametyev.musicstorage.repositories;

import com.rshekhmametyev.musicstorage.entities.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface AuthorRepository extends CrudRepository<Author, UUID> {
    Optional<Author> findByNicknameStartsWith(String nickname);
}