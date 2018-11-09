package com.rshekhmametyev.musicstorage.services;

import com.google.common.collect.Lists;
import com.rshekhmametyev.musicstorage.entities.MusicTrack;
import com.rshekhmametyev.musicstorage.repositories.AuthorRepository;
import com.rshekhmametyev.musicstorage.repositories.MusicTrackRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DefaultMusicTrackService implements MusicTrackService {
    private final MusicTrackRepository musicTrackRepository;

    public DefaultMusicTrackService(MusicTrackRepository musicTrackRepository) {
        this.musicTrackRepository = musicTrackRepository;
    }

    @Override
    public UUID add(MusicTrack track) {
        if (track == null) {
            throw new IllegalArgumentException("Track cannot be null");
        }

        UUID id = UUID.randomUUID();
        track.setId(id);

        this.musicTrackRepository.save(track);

        return id;
    }

    @Override
    public boolean delete(UUID id) {
        if (!this.musicTrackRepository.existsById(id)) {
            return false;
        }

        this.musicTrackRepository.deleteById(id);

        return true;
    }

    @Override
    public List<MusicTrack> getByAuthor(UUID authorId) {
        return Lists.newArrayList(this.musicTrackRepository.findAllByAuthorId(authorId));
    }

    @Override
    public List<MusicTrack> getByAlbum(UUID albumId) {
        return Lists.newArrayList(this.musicTrackRepository.findAllByAlbumId(albumId));
    }

    @Override
    public Optional<MusicTrack> get(UUID id) {
        return this.musicTrackRepository.findById(id);
    }

    @Override
    public List<MusicTrack> get() {
        return Lists.newArrayList(this.musicTrackRepository.findAll());
    }
}
