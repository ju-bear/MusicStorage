package com.rshekhmametyev.musicstorage.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Album")
public class Album {
    @Id
    @Column(name = "AlbumId")
    @Getter
    @Setter
    private UUID id;

    @Column(name = "Title", nullable = false)
    @Getter
    @Setter
    private String title;

    @Column(name = "ReleaseDate", nullable = false)
    @Getter
    @Setter
    private LocalDate releaseDate;

    @OneToMany
    @JoinColumn(name = "AuthorId")
    @Getter
    @Setter
    private List<MusicTrack> musicTracks;

    @ManyToOne
    @JoinColumn(name = "GenreId", nullable = false)
    @Getter
    @Setter
    private Genre genre;
}
