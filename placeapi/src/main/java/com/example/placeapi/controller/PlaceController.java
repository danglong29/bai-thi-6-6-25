package com.example.placeapi.controller;

import com.example.placeapi.model.Place;
import com.example.placeapi.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/place")
@CrossOrigin(origins = "*")  // Cho phép gọi từ Flutter
public class PlaceController {

    @Autowired
    private PlaceRepository placeRepository;

    @GetMapping("/getAllPlace")
    public List<Place> getAllPlace() {
        return placeRepository.findAll();
    }
}
