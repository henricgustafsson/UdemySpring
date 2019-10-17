package se.lexicon.henric.in28minutesSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * RESTFUL Web Services
 * 
 * 
 * User action							Request Type		URI
 * ______________________________________________________________________
 * Retreive all users					GET					/users
 * Create a user 						POST				/users
 * Retreive a user						GET					/users/{id}
 * Delete a user						DELETE				/users/{id}
 * Retreiving all poost for user		GET					/users/{id}/posts
 * Create post for a user				POST				/users/{id}/posts
 * Retrieve details of post				GET					/users/{id}/posts/{post_id}
 * */

@SpringBootApplication
public class In28minutesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(In28minutesSpringApplication.class, args);
	}

}
