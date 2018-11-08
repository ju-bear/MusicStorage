package com.rshekhmametyev.musicstorage.services;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.rshekhmametyev.musicstorage.entities.Author;
import com.rshekhmametyev.musicstorage.repositories.AuthorRepository;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class DefaultAuthorService implements AuthorService {
    private final AuthorRepository authorRepository;

    public DefaultAuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getByNickname(String nickname) {
        if (Strings.isNullOrEmpty(nickname)) {
            return Collections.emptyList();
        }

        List<Author> result = Lists.newArrayList(authorRepository.findByNickname(nickname));
        return result;
    }

    @Override
    public List<Author> get() {
        List<Author> result = Lists.newArrayList(authorRepository.findAll());
        return result;
    }

    @Override
    public boolean delete(UUID id) {
        if (!authorRepository.existsById(id)) {
            return false;
        }

        authorRepository.deleteById(id);
        return true;
    }
}
