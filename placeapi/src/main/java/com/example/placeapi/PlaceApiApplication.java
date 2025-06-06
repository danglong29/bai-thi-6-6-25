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
		placeRepository.save(new Place("Hà Nội", "Thủ đô ngàn năm văn hiến", "https://th.bing.com/th/id/OIP.WbPNl65eZxzL1QDIitlvZgHaE7?w=279&h=186&c=7&r=0&o=7&pid=1.7&rm=3"));
		placeRepository.save(new Place("Hồ Chí Minh", "Trung tâm kinh tế lớn nhất Việt Nam", "https://th.bing.com/th/id/OIP.8kFFPqQY4P1uU9PW4XwLqgHaEK?w=297&h=180&c=7&r=0&o=7&pid=1.7&rm=3"));
		placeRepository.save(new Place("Huế", "Cố đô với nhiều di tích lịch sử", "https://th.bing.com/th/id/OIP.ZBdYyvHUPJ1Aq42dtvXtLAHaE8?w=260&h=180&c=7&r=0&o=7&pid=1.7&rm=3"));
		placeRepository.save(new Place("Đà Nẵng", "Thành phố biển năng động", "https://th.bing.com/th/id/OIP.-VeJDm4d4pGItJ2dW1sPhwHaEW?w=268&h=180&c=7&r=0&o=7&pid=1.7&rm=3"));
		placeRepository.save(new Place("Hạ Long", "Vịnh biển nổi tiếng với cảnh quan tuyệt đẹp", "https://th.bing.com/th/id/OIP.KZsEtk78M9vVG61hwR9nAwHaE8?w=342&h=187&c=7&r=0&o=7&pid=1.7&rm=3"));
		placeRepository.save(new Place("Phú Quốc", "Đảo ngọc với bãi biển hoang sơ", "https://th.bing.com/th/id/OIP.nJ4KMAsc3wizA4Y5NmlIiQHaE8?w=317&h=180&c=7&r=0&o=7&pid=1.7&rm=3"));


	}
}
