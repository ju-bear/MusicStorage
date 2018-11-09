package com.rshekhmametyev.musicstorage.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "MusicTrack")
@Data
public class MusicTrack {
    @Id
    @Column(name = "MusicTrackId")
    private UUID id;

    @Column(name = "Title", nullable = false)
    private String title;

    @Column(name = "DurationMillis", nullable = false)
    private long durationMillis;

    @ManyToOne
    @JoinColumn(name = "AuthorId")
    private Author author;

    @Column(name = "CreationDate", nullable = false)
    private LocalDate creationDate;

    @ManyToOne()
    @JoinColumn(name = "AlbumId", nullable = false)
    private Album album;
}
