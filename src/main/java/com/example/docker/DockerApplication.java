package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DockerApplication {

	int n = 10; // Number of disks
	List<String> moves = new ArrayList<String>();


	String towersOfHanoi(int n, char from_rod,
						 char to_rod, char aux_rod)
	{
		if (n == 1)
		{
			moves.add("Move disk 1 from rod "+
					from_rod+" to rod "+to_rod);
			return null;
		}
		towersOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		moves.add("Move disk "+ n + " from rod " +
				from_rod +" to rod " + to_rod );
		towersOfHanoi(n - 1, aux_rod, to_rod, from_rod);
		return null;
	}


	@RequestMapping("/")
	public List<String> home() {

		String results = towersOfHanoi(n, 'A', 'C', 'B');
		return moves;
	}


	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}


}