package com.rshekhmametyev.musicstorage.services;

import com.rshekhmametyev.musicstorage.entities.Album;
import com.rshekhmametyev.musicstorage.repositories.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DefaultAlbumService implements AlbumService {
    private final AlbumRepository albumRepository;

    public DefaultAlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public UUID add(Album album) {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public List<Album> getByTitleStartingWith(String title) {
        return null;
    }

    @Override
    public List<Album> getByAuthorId(UUID id) {
        return this.albumRepository.findAllByMusicTracksAuthorId(id);
    }

    @Override
    public List<Album> getByTrackId(UUID id) {
        return this.albumRepository.findAllByMusicTracksId(id);
    }

    @Override
    public Optional<Album> getById(UUID id) {
        return Optional.empty();
    }
}
