package com.rshekhmametyev.musicstorage.services;

import com.google.common.collect.Lists;
import com.rshekhmametyev.musicstorage.entities.Album;
import com.rshekhmametyev.musicstorage.repositories.AlbumRepository;
import lombok.val;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
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
    public UUID add(@NotNull Album album) {
        val id = UUID.randomUUID();
        album.setId(id);

        this.albumRepository.save(album);
        return id;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public List<Album> getByTitleStartingWith(String title) {
        return this.albumRepository.findAllByTitleStartingWith(title);
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

    @Override
    public List<Album> get() {
        return Lists.newArrayList(this.albumRepository.findAll());
    }
}
