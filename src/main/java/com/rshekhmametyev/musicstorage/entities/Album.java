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
    @Column(name = "Title", nullable = false)
    private String title;
    @Column(name = "ReleaseDate", nullable = false)
    private LocalDate releaseDate;
    @OneToMany
    @JoinColumn(name = "AuthorId")
    private List<MusicTrack> musicTracks;
    @ManyToOne
    @JoinColumn(name = "GenreId", nullable = false)
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
        return this.musicTracks == null || this.musicTracks.size() < 2 ? AlbumType.COLLECTION : AlbumType.SINGLE;
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
