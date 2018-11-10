package com.rshekhmametyev.musicstorage.services;

import com.rshekhmametyev.musicstorage.repositories.GenreRepository;
import org.springframework.stereotype.Service;

@Service
public class DefaultAdminService implements AdminService {
    private final GenreRepository repository;

    public DefaultAdminService(GenreRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean removeAll() {
        this.repository.deleteAll();
        return true;
    }
}
