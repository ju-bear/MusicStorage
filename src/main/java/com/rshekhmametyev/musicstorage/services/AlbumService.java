package com.rshekhmametyev.musicstorage.services;

import com.rshekhmametyev.musicstorage.entities.Album;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AlbumService {
    UUID add(Album album);

    boolean delete(UUID id);

    List<Album> getByTitleStartingWith(String title);

    List<Album> getByAuthorId(UUID id);

    List<Album> getByTrackId(UUID id);

    Optional<Album> getById(UUID id);

    List<Album> get();
}
