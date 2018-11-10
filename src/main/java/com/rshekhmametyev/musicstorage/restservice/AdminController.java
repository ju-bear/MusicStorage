package com.rshekhmametyev.musicstorage.restservice;

import com.rshekhmametyev.musicstorage.services.AdminService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("admin")
@RestController
public class AdminController {
    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    @DeleteMapping("remove/all")
    public boolean removeAll() {
        return this.service.removeAll();
    }
}
