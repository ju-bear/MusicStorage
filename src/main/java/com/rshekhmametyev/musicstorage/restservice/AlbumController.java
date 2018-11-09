package com.rshekhmametyev.musicstorage.restservice;

import com.rshekhmametyev.musicstorage.entities.Album;
import com.rshekhmametyev.musicstorage.services.AlbumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
}
