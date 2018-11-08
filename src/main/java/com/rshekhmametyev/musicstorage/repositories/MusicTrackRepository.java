package com.rshekhmametyev.musicstorage.repositories;

import com.rshekhmametyev.musicstorage.entities.MusicTrack;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface MusicTrackRepository extends CrudRepository<MusicTrack, UUID> {
    Iterable<MusicTrack> findAllByTitleStartingWith(String title);

    Iterable<MusicTrack> findAllByAlbumId(UUID id);

    Iterable<MusicTrack> findAllByAuthorId(UUID id);
}
