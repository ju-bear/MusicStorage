package com.rshekhmametyev.musicstorage.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "MusicTrack")
public class MusicTrack {
    @Id
    @Column(name = "MusicTrackId")
    @Getter
    @Setter
    private UUID id;

    @Column(name = "Title", nullable = false)
    @Getter
    @Setter
    private String title;

    @Column(name = "DurationMillis", nullable = false)
    @Getter
    @Setter
    private long durationMillis;

    @ManyToOne
    @JoinColumn(name = "AuthorId")
    @Getter
    @Setter
    private Author author;

    @Column(name = "CreationDate", nullable = false)
    @Getter
    @Setter
    private LocalDate creationDate;

    @ManyToOne()
    @JoinColumn(name = "AlbumId", nullable = false)
    @Getter
    @Setter
    private Album album;
}
