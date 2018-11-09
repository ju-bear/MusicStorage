package com.rshekhmametyev.musicstorage.restservice;

import com.rshekhmametyev.musicstorage.entities.Author;
import com.rshekhmametyev.musicstorage.services.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/author")
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Author> get() {
        return this.service.get();
    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable UUID id) {
        return this.service.delete(id);
    }

    @PostMapping("add")
    public UUID add(@RequestBody Author author) {
        return this.service.add(author);
    }

    @GetMapping("nameStartsWith/{name}")
    public List<Author> getByNameStartsWith(@PathVariable String name) {
        return this.service.getByNicknameStartsWith(name);
    }
}
