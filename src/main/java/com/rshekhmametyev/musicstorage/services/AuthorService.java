package com.rshekhmametyev.musicstorage.services;

import com.rshekhmametyev.musicstorage.entities.Author;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AuthorService {
    List<Author> getByNicknameStartsWith(String nickname);

    List<Author> get();

    boolean delete(UUID id);

    UUID add(Author author);
}
