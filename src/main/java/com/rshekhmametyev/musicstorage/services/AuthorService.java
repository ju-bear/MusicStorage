package com.rshekhmametyev.musicstorage.services;

import com.rshekhmametyev.musicstorage.entities.Author;

import java.util.List;
import java.util.UUID;

public interface AuthorService {
    List<Author> getByNickname(String nickname);

    List<Author> get();

    boolean delete(UUID id);
}
