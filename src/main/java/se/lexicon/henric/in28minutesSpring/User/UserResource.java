package se.lexicon.henric.in28minutesSpring.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



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
	public void createUser(@RequestBody User user) {
		User saved =service.save(user);
		
		
	}
	
	
}
