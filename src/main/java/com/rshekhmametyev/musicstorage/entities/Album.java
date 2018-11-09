package com.rshekhmametyev.musicstorage.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Album")
@Data
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
}
