package com.rshekhmametyev.musicstorage.services;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.rshekhmametyev.musicstorage.entities.Author;
import com.rshekhmametyev.musicstorage.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
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

        return Lists.newArrayList(authorRepository.findByNickname(nickname));
    }

    @Override
    public List<Author> get() {
        return Lists.newArrayList(authorRepository.findAll());
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
