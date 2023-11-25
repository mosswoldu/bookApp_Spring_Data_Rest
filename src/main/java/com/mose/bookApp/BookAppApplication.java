package com.mose.bookApp;

import com.mose.bookApp.model.Book;
import com.mose.bookApp.repository.BookRepositorty;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class BookAppApplication  {


	public static void main(String[] args) {
		SpringApplication.run(BookAppApplication.class, args);
	}


}
