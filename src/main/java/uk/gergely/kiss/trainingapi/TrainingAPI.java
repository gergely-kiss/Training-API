package uk.gergely.kiss.trainingapi;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Main method of the training API collection
 * @author kiss-
 *
 */

@SpringBootApplication
public class TrainingAPI {

	public static void main(String[] args) {
		SpringApplication.run(TrainingAPI.class, args);
	}

}
