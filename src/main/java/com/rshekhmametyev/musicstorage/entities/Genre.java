package com.rshekhmametyev.musicstorage.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "genre")
@Data
public class Genre {
    @Id
    @Column(name = "GenreId")
    private UUID id;

    @Column(name = "Title", nullable = false)
    private String title;
}
