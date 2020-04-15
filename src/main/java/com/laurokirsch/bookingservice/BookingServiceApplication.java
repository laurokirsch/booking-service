package com.laurokirsch.bookingservice;

import com.laurokirsch.bookingservice.data.domain.Guest;
import com.laurokirsch.bookingservice.data.domain.Reservation;
import com.laurokirsch.bookingservice.data.domain.Room;
import com.laurokirsch.bookingservice.data.repository.GuestRepository;
import com.laurokirsch.bookingservice.data.repository.RoomRepository;
import com.laurokirsch.bookingservice.data.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingServiceApplication.class, args);
	}

}
