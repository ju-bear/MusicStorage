package com.rshekhmametyev.musicstorage.repositories;

import com.rshekhmametyev.musicstorage.entities.MusicTrack;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface MusicTrackRepository extends CrudRepository<MusicTrack, UUID> {
    List<MusicTrack> findAllByTitle(String title);

    List<MusicTrack> findAllByAlbumId(UUID id);

    List<MusicTrack> findAllByAuthorId(UUID id);
}
