package com.rshekhmametyev.musicstorage.services;

import com.rshekhmametyev.musicstorage.entities.MusicTrack;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MusicTrackService {
    UUID add(MusicTrack track);

    boolean delete(UUID id);

    List<MusicTrack> getByAuthor(UUID authorId);

    List<MusicTrack> getByAlbum(UUID albumId);

    Optional<MusicTrack> get(UUID id);

    List<MusicTrack> get();
}
