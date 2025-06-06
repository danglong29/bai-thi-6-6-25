package com.example.placeapi;

import com.example.placeapi.model.Place;
import com.example.placeapi.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaceApiApplication implements CommandLineRunner {

	@Autowired
	private PlaceRepository placeRepository;

	public static void main(String[] args) {
		SpringApplication.run(PlaceApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Thêm dữ liệu mẫu
		placeRepository.save(new Place("Paris", "City of Light", "https://upload.wikimedia.org/wikipedia/commons/a/a8/Tour_Eiffel_Wikimedia_Commons.jpg"));
		placeRepository.save(new Place("London", "Capital of England", "https://upload.wikimedia.org/wikipedia/commons/c/cd/London_Montage_L.jpg"));
		placeRepository.save(new Place("Tokyo", "Capital of Japan", "https://upload.wikimedia.org/wikipedia/commons/9/9e/Tokyo_Tower_and_surrounding_buildings.jpg"));
	}
}
