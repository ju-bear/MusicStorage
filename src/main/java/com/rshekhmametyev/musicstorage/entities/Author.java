package com.rshekhmametyev.musicstorage.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Author")
public class Author {
    @Id
    @Column(name = "AuthorId")
    @Getter
    @Setter
    private UUID id;

    @Column(name = "Nickname", nullable = false)
    @Getter
    @Setter
    private String nickname;

    @Column(name = "FirstName", nullable = false)
    @Getter
    @Setter
    private String firstName;

    @Column(name = "LastName", nullable = false)
    @Getter
    @Setter
    private String lastName;

    @Column(name = "Patronymic")
    @Getter
    @Setter
    private String patronymic;

    @Column(name = "Birthdate", nullable = false)
    @Getter
    @Setter
    private LocalDate birthdate;

    @Column(name = "Country", nullable = false)
    @Getter
    @Setter
    private String country; // TODO should a separate entity be used?

    @ManyToOne
    @JoinColumn(name = "GenreId")
    @Getter
    @Setter
    private Genre genre;
}
