package com.rshekhmametyev.musicstorage.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Author")
@Data
public class Author {
    @Id
    @Column(name = "AuthorId")
    private UUID id;

    @Column(name = "Nickname", nullable = false)
    private String nickname;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "LastName", nullable = false)
    private String lastName;

    @Column(name = "Patronymic")
    private String patronymic;

    @Column(name = "Birthdate", nullable = false)
    private LocalDate birthdate;

    @Column(name = "Country", nullable = false)
    private String country; // TODO should a separate entity be used?

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "GenreId")
    private Genre genre;
}
