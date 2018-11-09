package com.rshekhmametyev.musicstorage.restservice;

import com.rshekhmametyev.musicstorage.entities.Album;
import com.rshekhmametyev.musicstorage.entities.MusicTrack;
import com.rshekhmametyev.musicstorage.services.AlbumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/album")
public class AlbumController {
    private final AlbumService service;

    public AlbumController(AlbumService service) {
        this.service = service;
    }

    @GetMapping("author/{authorId}")
    public List<Album> getByAuthorId(@PathVariable("authorId") UUID authorId) {
        return this.service.getByAuthorId(authorId);
    }

    @GetMapping("musictrack/{musicTrackId}")
    public List<Album> getByMusicTrackId(@PathVariable UUID musicTrackId) {
        return this.service.getByTrackId(musicTrackId);
    }

    @PostMapping("add")
    public UUID addTrack(@RequestBody Album album) {
        return this.service.add(album);
    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable UUID id) {
        return this.service.delete(id);
    }

    @GetMapping("titleStartsWith/{title}")
    public List<Album> getByTitleStartsWith(@PathVariable String title) {
        return this.service.getByTitleStartingWith(title);
    }

    @GetMapping("{id}")
    public Optional<Album> getById(@PathVariable UUID id) {
        return this.service.getById(id);
    }

    @GetMapping("")
    public List<Album> get() {
        return this.service.get();
    }
}
