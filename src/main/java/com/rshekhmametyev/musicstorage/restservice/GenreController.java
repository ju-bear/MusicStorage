package com.rshekhmametyev.musicstorage.restservice;

import com.rshekhmametyev.musicstorage.entities.Genre;
import com.rshekhmametyev.musicstorage.services.GenreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/genre")
public class GenreController {
    private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("")
    public List<Genre> get() {
        return this.genreService.get();
    }

    @PostMapping("add")
    public UUID add(@RequestBody Genre genre) {
        return this.genreService.add(genre);
    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable UUID id) {
        return this.genreService.delete(id);
    }
}
