package se.lexicon.henric.in28minutesSpring.User;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;



@RestController
public class UserResource {

	@Autowired
	private UserDao service;
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.FindAll();
	}
	
	@GetMapping("/users/{id}")
	public User retreiveUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser =service.save(user);
		 
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
												  .path("/{id}")
												  .buildAndExpand(savedUser.getId())
												  .toUri(); 
		return ResponseEntity.created(location).build();
	}
	
	
}
