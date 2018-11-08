package com.rshekhmametyev.musicstorage.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "MusicTrack")
public class MusicTrack {
    @Id
    @Column(name = "MusicTrackId")
    private UUID id;
    @Column(name = "Title")
    private String title;
    @Column(name = "DurationMillis")
    private long durationMillis;
    @ManyToOne
    @JoinColumn(name = "AuthorId")
    private Author author;
    @Column(name = "CreationDate")
    private int creationDate;
    @ManyToOne
    @JoinColumn(name = "AlbumId")
    private Album album;

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

    public long getDurationMillis() {
        return durationMillis;
    }

    public void setDurationMillis(long durationMillis) {
        this.durationMillis = durationMillis;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
