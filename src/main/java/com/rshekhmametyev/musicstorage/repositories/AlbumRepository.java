package com.rshekhmametyev.musicstorage.repositories;

import com.rshekhmametyev.musicstorage.entities.Album;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface AlbumRepository extends CrudRepository<Album, UUID> {
    List<Album> findAllByTitleStartingWith(String title);

    List<Album> findAllByMusicTracksAuthorId(UUID id);

    List<Album> findAllByMusicTracksId(UUID id);
}
