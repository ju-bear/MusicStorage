package com.rshekhmametyev.musicstorage.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Album")
public class Album {
    @Id
    @Column(name = "AlbumId")
    private UUID id;
    @Column(name = "Title")
    private String title;
    @Column(name = "ReleaseDate")
    private LocalDate releaseDate;
    @Column(name = "AlbumType")
    private AlbumType albumType;
    @OneToMany
    private List<MusicTrack> musicTracks;
    @ManyToOne
    @JoinColumn(name = "GenreId")
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
