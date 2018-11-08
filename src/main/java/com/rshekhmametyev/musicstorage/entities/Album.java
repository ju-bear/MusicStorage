package com.rshekhmametyev.musicstorage.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Album {
    private UUID id;
    private String title;
    private LocalDate releaseDate;
    private boolean isSingle;
    private AlbumType albumType;
    private List<MusicTrack> musicTracks;
    private Genre genre;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean single) {
        isSingle = single;
    }

    public AlbumType getAlbumType() {
        return albumType;
    }

    public void setAlbumType(AlbumType albumType) {
        this.albumType = albumType;
    }

    public List<MusicTrack> getMusicTracks() {
        return musicTracks;
    }

    public void setMusicTracks(List<MusicTrack> musicTracks) {
        this.musicTracks = musicTracks;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
