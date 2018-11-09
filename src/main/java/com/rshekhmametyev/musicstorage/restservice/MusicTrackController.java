package com.rshekhmametyev.musicstorage.restservice;

import com.rshekhmametyev.musicstorage.entities.MusicTrack;
import com.rshekhmametyev.musicstorage.services.MusicTrackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/track")
public class MusicTrackController {
    private final MusicTrackService service;

    public MusicTrackController(MusicTrackService service) {
        this.service = service;
    }

    @GetMapping("author/{authorId}")
    public List<MusicTrack> getByAuthor(@PathVariable UUID authorId) {
        return this.service.getByAuthor(authorId);
    }

    @GetMapping("album/{albumId}")
    public List<MusicTrack> getByAlbum(@PathVariable UUID albumId) {
        return this.service.getByAlbum(albumId);
    }

    @GetMapping("{id}")
    public Optional<MusicTrack> get(@PathVariable UUID id) {
        return this.service.get(id);
    }

    @GetMapping("")
    public List<MusicTrack> get() {
        return this.service.get();
    }

    @PostMapping("add")
    public UUID add(@RequestBody MusicTrack track) {
        return this.service.add(track);
    }
}
